package com.noteManagerSystem.stickynotes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noteManagerSystem.stickynotes.model.entity.UserEntity;


public interface UserRepo extends JpaRepository<UserEntity, Long> {

	Optional<UserEntity> findByUsername(String username);
	
    Boolean existsByEmail(String email);

    Optional<UserEntity> findByUsernameOrEmail(String username, String email);
    
    boolean existsByUsername(String username);
}


