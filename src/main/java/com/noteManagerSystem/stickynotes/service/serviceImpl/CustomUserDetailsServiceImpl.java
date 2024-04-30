package com.noteManagerSystem.stickynotes.service.serviceImpl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import com.noteManagerSystem.stickynotes.model.entity.UserEntity;
import com.noteManagerSystem.stickynotes.repository.UserRepo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomUserDetailsServiceImpl implements UserDetailsService {

		private UserRepo userRepository;

		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			
			UserEntity user = userRepository.findByUsername(username)
	                .orElseThrow(() -> new UsernameNotFoundException("User not exists by Username or Email"));

	        Set<GrantedAuthority> authorities = user.getRoles().stream()
	                .map((role) -> new SimpleGrantedAuthority(role.getName()))
	                .collect(Collectors.toSet());

	        return new org.springframework.security.core.userdetails.User(
	        		username,
	                user.getPassword(),
	                authorities
	        );
		}
	}

