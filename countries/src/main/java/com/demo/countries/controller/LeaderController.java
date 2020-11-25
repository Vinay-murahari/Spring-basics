package com.demo.countries.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.countries.data.entity.Leader;
import com.demo.countries.service.LeaderService;

@Controller
public class LeaderController {
	private LeaderService leaderService;
	
	@GetMapping("/leaders")
	public String viewLeaders(Model model) {
		return "leader";
	}
	
	@GetMapping("/leaderEntry")
	public String LeaderForm(Model model) {
		Leader leader = new Leader();
		model.addAttribute(leader);
		return "leaderEntry";
	}
	
	@PostMapping("/saveLeader")
	public String saveLeader(@ModelAttribute("leader") Leader leader) {
		leaderService.saveLeaderEntry(leader);
		return "redirect:/";
	}
}
