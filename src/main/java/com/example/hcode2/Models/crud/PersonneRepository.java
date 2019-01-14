package com.example.hcode2.Models.crud;

import org.springframework.data.repository.CrudRepository;

import com.example.hcode2.Models.Personne;

public interface PersonneRepository extends CrudRepository<Personne, Integer> {

}