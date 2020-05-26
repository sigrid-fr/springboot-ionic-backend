package com.ifma.cursomc.repositories;

import org.springframework.stereotype.Repository;

import com.ifma.cursomc.domain.Estado;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
