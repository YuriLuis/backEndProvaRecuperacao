package com.prova.recuperacao.provaRecuperacao.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.recuperacao.provaRecuperacao.classe.Time;
import com.prova.recuperacao.provaRecuperacao.repository.TimeRepository;

@RestController
@RequestMapping("/time")
@CrossOrigin("*")
public class TimeController {

	@Autowired
	private TimeRepository repository;
	
	@PostMapping
	public Time save(@RequestBody @Valid Time time) {
		return repository.save(time);
	}
	
	@GetMapping
	public List<Time> findAll() {
		return repository.findAll();
	}	
}
