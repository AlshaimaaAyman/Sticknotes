package com.noteManagerSystem.stickynotes.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.noteManagerSystem.stickynotes.model.dto.UserDTO;
import com.noteManagerSystem.stickynotes.model.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
	
	UserDTO toDto(UserEntity entity);
	
	List<UserDTO> toDtos(List<UserEntity> entities);

}
