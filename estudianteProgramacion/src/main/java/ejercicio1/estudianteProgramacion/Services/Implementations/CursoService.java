package ejercicio1.estudianteProgramacion.Services.Implementations;

import ejercicio1.estudianteProgramacion.Entities.Curso;
import ejercicio1.estudianteProgramacion.Repositories.CursoRepository;
import ejercicio1.estudianteProgramacion.Services.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService implements ICursoService {

    @Autowired()
    private CursoRepository cursoRepository;

    public Curso create(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> getAll() {
        return cursoRepository.findAll();
    }

    @Override
    public List<Curso> getAllByNombre(String nombreCurso) {
        return cursoRepository.findByNombreContaining(nombreCurso);
    }

    @Override
    public Curso update(Curso curso) {
        if (!cursoRepository.existsById(curso.getId())) {
            throw new RuntimeException("Course not found");
        }

        return cursoRepository.save(curso);
    }
}
