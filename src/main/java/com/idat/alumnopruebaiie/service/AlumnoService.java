package com.idat.alumnopruebaiie.service;

import com.idat.alumnopruebaiie.model.Alumno;

import java.util.List;

public interface AlumnoService {
    List<Alumno> listar();

    Alumno obtenerId(Integer id);
    void guardar(Alumno alumno);
    void eliminar(Integer id);
    void actualizar(Alumno alumno);
}
