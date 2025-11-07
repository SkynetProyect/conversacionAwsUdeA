package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Mensaje;
import com.example.demo.repository.MensajeRepository;

@Service
public class MensajeService {
    private MensajeRepository repository;

    public MensajeService(MensajeRepository repository){
        this.repository = repository;
    }

    public List<Mensaje> findAll(){
        return this.repository.findAll();
    }

    public Mensaje save(Mensaje mensaje){
        return this.repository.save(mensaje);
    }

    public void delete(Integer id){
        this.repository.deleteById(id);
    }
}
