package com.example.PracticaCrud.Controllers;

import com.example.PracticaCrud.Entity.Estudiante;
import com.example.PracticaCrud.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class EstudianteControllers {

    //inyectar el servicio de estudiante
    @Autowired
    EstudianteService EstudianteService;

    @GetMapping
    public List<Estudiante> listarEstudiante(){
        //invocar el metodo findAll del servicio
        return EstudianteService.findAll();
    }
    @GetMapping(value = "/{id}")
    public Estudiante obtenerEstudiante(@PathVariable Long id){
        //invocar el metodo findById del estudiante
        return EstudianteService.findById(id);
    }
    @GetMapping(value = "/name")
    public Estudiante obtenerEstudiante(@RequestParam String name){
        return  EstudianteService.findByNameContaining(name);
    }
    @PostMapping
    public void crearEstudiante(@RequestBody Estudiante estudiante){
        EstudianteService.createEstudiante(estudiante);
    }
    @PutMapping(value = "/{id}")
    public void modificarEstudiante(@PathVariable Long id,@RequestBody Estudiante estudiante){
        EstudianteService.modifyEstudiante(id, estudiante);
    }
    @DeleteMapping(value = "/{id}")
        public void eliminarEstudiante(@PathVariable Long id){
        EstudianteService.deleteEstudiante(id);
    }
}
