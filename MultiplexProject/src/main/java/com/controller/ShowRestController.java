package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ShowService;
import com.model.Show;

@RestController
public class ShowRestController {
@Autowired
ShowService service;

@GetMapping("/getShows")
public List<Show> findall(){
	return service.findAllShows();
}

public String add(Show s) {
	service.add(s);
	return "Show added successfully";
}
}
