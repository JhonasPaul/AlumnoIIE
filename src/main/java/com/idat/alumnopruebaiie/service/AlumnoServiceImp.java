package com.idat.alumnopruebaiie.service;

import com.idat.alumnopruebaiie.model.Alumno;
import com.idat.alumnopruebaiie.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AlumnoServiceImp implements AlumnoService{

    @Autowired
    private AlumnoRepository repository;
    @Override
    public List<Alumno> listar() {
        return repository.findAll();
    }

    @Override
    public Alumno obtenerId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void guardar(Alumno alumno) {
        repository.save(alumno);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void actualizar(Alumno alumno) {
//        repository.saveAllAndFlush(alumno);
    }
}
