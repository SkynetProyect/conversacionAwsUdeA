package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mensaje")
public class Mensaje{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mensaje;

    public Mensaje(){}
    public Integer getId(){ return this.id;}
    public String getMensaje(){ return this.mensaje;}

    public Mensaje(Integer id, String mensaje){
        this.id = id;
        this.mensaje = mensaje;
    }
}