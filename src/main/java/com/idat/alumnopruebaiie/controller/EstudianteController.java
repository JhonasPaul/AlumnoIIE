package com.idat.alumnopruebaiie.controller;

import com.idat.alumnopruebaiie.model.Alumno;
import com.idat.alumnopruebaiie.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/estudiante/v1")/*recurso principal o recuerso base*/
public class EstudianteController {

    @Autowired
    private AlumnoService service;

    @GetMapping("/hola")/*sub recurso*/
    public @ResponseBody String holaMundo() {
        return "Hola";
    }

    @GetMapping("/listar")/*sub recurso*/
    public  @ResponseBody List<Alumno> listar() {
        return service.listar();
    }

    @GetMapping("/listar/{id}")
    public @ResponseBody Alumno obtener(@PathVariable Integer id) {
        return service.obtenerId(id);
    }

    @PostMapping("/guardar")
    public @ResponseBody void guardar(Alumno alumno) {
        service.guardar(alumno);
    }

    @PutMapping("/actualizar")
    public @ResponseBody void avtualizar(Alumno alumno) {
        service.actualizar(alumno);
    }

    @DeleteMapping("eliminar/{id}")
    public @ResponseBody void eliminar(Integer id) {
        service.eliminar(id);
    }
}
