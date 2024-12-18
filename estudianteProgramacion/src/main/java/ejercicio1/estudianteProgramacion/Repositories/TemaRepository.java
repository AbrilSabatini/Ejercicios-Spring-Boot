package ejercicio1.estudianteProgramacion.Repositories;

import ejercicio1.estudianteProgramacion.Entities.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {

    /** Obtiene los temas de un determinado curso.
     *
     * @param cursoId ID del curso
     * @return una lista de temas asociados al curso
     */
    List<Tema> findByCursoId(Long cursoId);

}
