package com.noteManagerSystem.stickynotes.service;

import java.util.List;

import com.noteManagerSystem.stickynotes.model.dto.StickyNoteDTO;
import com.noteManagerSystem.stickynotes.model.dto.UserDTO;
import com.noteManagerSystem.stickynotes.model.enums.StickyNoteStatus;

public interface UserService {
	
	List<UserDTO> allUsers();

}
