package ejercicio1.estudianteProgramacion.Services;

import ejercicio1.estudianteProgramacion.Entities.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITemaService {
    Tema create(Tema tema);

    List<Tema> getByCursoId(Long cursoId);

    Tema update(Tema tema);
}
