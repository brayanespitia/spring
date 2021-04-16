package com.udemy.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.entity.Curso;

@Repository("cursoJpaRepository")
public interface Curso_Jpa_Repository extends JpaRepository<Curso, Serializable>{

}
