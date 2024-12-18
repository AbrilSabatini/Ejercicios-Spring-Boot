package ejercicio1.estudianteProgramacion.Repositories;

import ejercicio1.estudianteProgramacion.Entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    /** Obtiene los cursos que contengan el <b>nombre</b> dado.
     *
     * @param nombre el nombre parcial o completo del curso
     * @return una lista de cursos que coinciden con el nombre
     */
    List<Curso> findByNombreContaining(String nombre);

}
