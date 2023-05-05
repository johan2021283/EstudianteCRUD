package com.example.PracticaCrud.service;

import com.example.PracticaCrud.Dao.EstudianteDao;
import com.example.PracticaCrud.Entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoServiceImp implements EstudianteService {
    // inyectamos el dato
    @Autowired
    private EstudianteDao EstudianteDao;

    // implementacion del metodo para listar
    @Override
    public List<Estudiante> findAll() {
        return (List<Estudiante>) EstudianteDao.findAll();
    }

    // implementacion del metodod para obtener estudiante especifico
    @Override
    public Estudiante findById(Long id) {
        // se invoca al metodo del dao
        // el dao retorna un optional para proteger de valores nulos
        return EstudianteDao.findById(id).orElse(null);
    }


    @Override
    public void createEstudiante(Estudiante estudiante) {
        EstudianteDao.save(estudiante);

    }

    @Override
    public void modifyEstudiante(Long id, Estudiante estudiante) {
        if (EstudianteDao.existsById(id)){
            estudiante.setId(id);
            EstudianteDao.save(estudiante);
        }
    }

    @Override
    public void deleteEstudiante(Long id) {
        if (EstudianteDao.existsById(id)){
            EstudianteDao.deleteById(id);
        }
    }

    @Override
    public Estudiante findByNameContaining(String name) {
        return null;
    }
}
