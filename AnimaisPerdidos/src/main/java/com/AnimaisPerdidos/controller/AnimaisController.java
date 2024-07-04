package com.AnimaisPerdidos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AnimaisPerdidos.model.Animais;
import com.AnimaisPerdidos.service.AnimaisService;

@RestController
@RequestMapping("/animais")
public class AnimaisController {

	@Autowired
	private AnimaisService animaisService;
	
	@GetMapping
	public List<Animais> getListarTodos() {
		return animaisService.listarTodos();
	}
	
	@GetMapping("/teste")
	public String teste() {
		return "OK";
	}
}
