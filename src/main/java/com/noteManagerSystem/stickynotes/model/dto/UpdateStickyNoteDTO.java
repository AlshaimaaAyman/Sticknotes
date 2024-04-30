package com.noteManagerSystem.stickynotes.model.dto;

import com.noteManagerSystem.stickynotes.model.enums.StickyNoteStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class UpdateStickyNoteDTO {
	
	
	private String description;
	
	private String name;
	
	private String color;
	
	private StickyNoteStatus status;

}
