package com.unicuritiba.ProjetoCadastro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicuritiba.ProjetoCadastro.cadastro.Cadastro;
import com.unicuritiba.ProjetoCadastro.cadastro.CadastroRepository;

@RestController
public class AlunoController {
	@Autowired
	CadastroRepository repository;
	@GetMapping("/alunos")
	public ResponseEntity<List<Cadastro>> getAlunos(){
		return ResponseEntity.ok(repository.findAll());
	}
	
}
