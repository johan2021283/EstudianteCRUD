package com.example.PracticaCrud.service;

import com.example.PracticaCrud.Entity.Estudiante;

import java.util.List;

public interface EstudianteService {
    public List<Estudiante> findAll();
    public Estudiante findById(Long id);
    public void createEstudiante(Estudiante estudiante);
    public void modifyEstudiante(Long id, Estudiante estudiante);
    public void deleteEstudiante(Long id);

    public Estudiante findByNameContaining(String name);
}
