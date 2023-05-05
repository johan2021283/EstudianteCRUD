package com.example.PracticaCrud.Dao;

import com.example.PracticaCrud.Entity.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteDao extends CrudRepository <Estudiante, Long> {

}
