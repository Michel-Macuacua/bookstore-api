package com.michel.bookstore.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import com.michel.bookstore.domain.Livro;

import org.hibernate.validator.constraints.Length;


public class LivroDTO implements Serializable{

    public static final long serialVersionUID = 1L;

    private Integer id;
    
    @NotEmpty(message = "Campo TITULO requerido")
    @Length(min = 3, max = 50, message = "O campo TITULO deve ter entre 3 a 50 caracteres")
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
