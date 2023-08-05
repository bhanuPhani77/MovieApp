package com.movieapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieapp.entities.Theatre;
import com.movieapp.service.TheatreService;

@RestController
@RequestMapping("api/v1")
public class TheatreController {
	@Autowired
	private TheatreService theatreService;
	@PostMapping("/theatre")
	ResponseEntity<Theatre> saveDetails(@RequestBody Theatre theatre){
		Theatre postThetreDetails = theatreService.postThetreDetails(theatre);
		return ResponseEntity.ok(postThetreDetails);
	}
	@GetMapping("/theatre/all")
	ResponseEntity<List<Theatre>> getAll(){
		List<Theatre> allThetres = theatreService.getAllThetres();
		return ResponseEntity.ok(allThetres);
	}
}
