package com.michel.bookstore.service;

import java.util.Optional;

import com.michel.bookstore.domain.Livro;
import com.michel.bookstore.repositories.LivroRepository;
import com.michel.bookstore.service.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public Livro findById(Integer id) {
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Livro nao encontrado! Id: " + id + ", Tipo: " + Livro.class.getName()));
    }

}
