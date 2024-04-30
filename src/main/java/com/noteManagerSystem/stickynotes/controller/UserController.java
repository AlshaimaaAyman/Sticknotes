package com.noteManagerSystem.stickynotes.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.noteManagerSystem.stickynotes.model.dto.UserDTO;
import com.noteManagerSystem.stickynotes.service.UserService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
	

	    private UserService userService ; 
	
//	    @GetMapping("")
//	    public String index(){
//	        return "users";
//	    }
	    
		@GetMapping("")
		public String users(Model model) {
			List<UserDTO> dtos = this.userService.allUsers();
			model.addAttribute("users",dtos);
			return "users";
		}
	}


