package com.michel.bookstore.dtos;

import java.io.Serializable;

import com.michel.bookstore.domain.Livro;

public class LivroDTO implements Serializable{

    public static final long serialVersionUID = 1L;

    private Integer id;
    private String titulo;

    public LivroDTO() {
        super();
    }

    public LivroDTO(Livro obj) {
        this.id = obj.getId();
        this.titulo = obj.getTitulo();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    

    
    
    
}
