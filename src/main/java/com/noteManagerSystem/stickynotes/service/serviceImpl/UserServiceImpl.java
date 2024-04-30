package com.noteManagerSystem.stickynotes.service.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.noteManagerSystem.stickynotes.repository.UserRepo;
import com.noteManagerSystem.stickynotes.model.dto.UserDTO;
import com.noteManagerSystem.stickynotes.model.entity.UserEntity;
import com.noteManagerSystem.stickynotes.model.mapper.UserMapper;
import com.noteManagerSystem.stickynotes.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
	
	private final UserRepo userRepo;
	private final UserMapper userMapper;

	@Override
	public List<UserDTO> allUsers() {
		
		List<UserEntity> entities = this.userRepo.findAll();
		
		return this.userMapper.toDtos(entities);
	}

}
