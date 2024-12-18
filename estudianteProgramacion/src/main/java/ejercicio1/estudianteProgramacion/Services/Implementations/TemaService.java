package ejercicio1.estudianteProgramacion.Services.Implementations;

import ejercicio1.estudianteProgramacion.Entities.Tema;
import ejercicio1.estudianteProgramacion.Repositories.CursoRepository;
import ejercicio1.estudianteProgramacion.Repositories.TemaRepository;
import ejercicio1.estudianteProgramacion.Services.ITemaService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService {
    @Autowired
    private TemaRepository temaRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Tema create(Tema tema) {
        verifyCourseExists(tema.getCurso().getId());
        return temaRepository.save(tema);
    }

    // Verifica que el curso exista
    public void verifyCourseExists(Long cursoId) {
        System.out.println("Llego acá");
        if (!cursoRepository.existsById(cursoId)) {
            throw new EntityNotFoundException("El curso con el ID #" + cursoId + " no existe.");
        }
    }

    @Override
    public List<Tema> getByCursoId(Long cursoId) {
        verifyCourseExists(cursoId);
        return temaRepository.findByCursoId(cursoId);
    }

    @Override
    public Tema update(Tema tema) {
        if (!temaRepository.existsById(tema.getId())) {
            throw new EntityNotFoundException("El tema con el ID " + tema.getId() + " no existe.");
        }

        return temaRepository.save(tema);
    }
}
