package com.vinay.programmer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vinay.programmer.entity.Programmer;
import com.vinay.programmer.repo.ProgrammerRepo;

@Controller
public class programmerController {
	@Autowired
	ProgrammerRepo repo;
	
	@GetMapping("/newprogrammer")
	public String newForm(Programmer programmer) {
		repo.save(programmer);
		return "newprogrammer";
	}
//	@PostMapping("/addProgrammer")
//	public String addProgrammer(Programmer programmer) {
//		repo.save(programmer);
//		return "index";
//		
//	}
}


