package com.michel.bookstore.service;

import java.util.Optional;

import com.michel.bookstore.domain.Categoria;
import com.michel.bookstore.repositories.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CategoriaService
 */

@Service
public class CategoriaService {


    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElse(null);
    }

    
}