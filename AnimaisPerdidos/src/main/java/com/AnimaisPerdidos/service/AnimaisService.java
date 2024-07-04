package com.AnimaisPerdidos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnimaisPerdidos.model.Animais;
import com.AnimaisPerdidos.repository.AnimaisRepository;


@Service
public class AnimaisService {
	
	@Autowired
	private AnimaisRepository animaisRepository;
	
	public List<Animais> listarTodos() {
		return animaisRepository.findAll();
	}
	
	public Animais salvar(Animais animal) {
		return animaisRepository.save(animal);
	}
	
}
