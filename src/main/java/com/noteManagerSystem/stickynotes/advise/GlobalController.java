package com.noteManagerSystem.stickynotes.advise;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@ControllerAdvice
public class GlobalController {

	private final HttpServletRequest httpServletRequest;
	
	@ModelAttribute("urlPath")
	public String getPath() {
		return httpServletRequest.getContextPath() ;
	}
}
