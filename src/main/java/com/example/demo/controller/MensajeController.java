package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Mensaje;
import com.example.demo.service.MensajeService;

import java.util.List;

@RestController
@RequestMapping("/mensaje")
public class MensajeController {
    private MensajeService service;
    public MensajeController(MensajeService service){this.service = service;}
    
    @GetMapping("/all")
    public ResponseEntity<List<Mensaje>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("")
    public ResponseEntity<Mensaje> save(@RequestBody Mensaje mensaje){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(mensaje));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
