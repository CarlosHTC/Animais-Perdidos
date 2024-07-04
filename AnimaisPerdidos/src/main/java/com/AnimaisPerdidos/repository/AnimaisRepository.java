package com.AnimaisPerdidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AnimaisPerdidos.model.Animais;

@Repository
public interface AnimaisRepository extends JpaRepository<Animais, Long> {

}
