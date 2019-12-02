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

import com.prova.recuperacao.provaRecuperacao.classe.Jogador;
import com.prova.recuperacao.provaRecuperacao.repository.JogadorRepository;

@RestController
@RequestMapping("/jogador")
@CrossOrigin("*")
public class JogadorController {

	@Autowired
	private JogadorRepository repository;
	
	@PostMapping
	public Jogador save(@RequestBody @Valid Jogador jogador) {
		return repository.save(jogador);
	}
	
	@GetMapping
	public List<Jogador> findAll() {
		return repository.findAll();
	}	
}
