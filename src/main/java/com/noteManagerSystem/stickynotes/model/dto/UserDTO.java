package com.noteManagerSystem.stickynotes.model.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
	

	private Long id;
	private String username;
    private String password;
    private String undecryptedPassword;
    private String name;
    private String email;
	

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
