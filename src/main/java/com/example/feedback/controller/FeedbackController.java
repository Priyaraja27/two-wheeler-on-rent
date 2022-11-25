package com.example.feedback.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feedback.entites.Feedback;
import com.example.feedback.service.FeedbackService;

@RestController


public class FeedbackController {
	@Autowired
	FeedbackService fbservice;

	@PostMapping("/addData")
	public Feedback addFeedback(@Valid @RequestBody Feedback fb) {
		return fbservice.addFeedback(fb);
	}

	@GetMapping("/getData")
	public List<Feedback> findAll() {
		return fbservice.listAll();
	}
}