package com.noteManagerSystem.stickynotes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noteManagerSystem.stickynotes.model.entity.RoleEntity;


public interface RoleRepo extends JpaRepository<RoleEntity, Long> {
	
		
	    Optional<RoleEntity> findByName(String name);

}
