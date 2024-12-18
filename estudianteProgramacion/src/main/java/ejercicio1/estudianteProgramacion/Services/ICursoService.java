package ejercicio1.estudianteProgramacion.Services;

import ejercicio1.estudianteProgramacion.Entities.Curso;

import java.util.List;

public interface ICursoService {

    Curso create(Curso curso);

    List<Curso> getAll();

    List<Curso> getAllByNombre(String nombreCurso);

    Curso update(Curso curso);
}
