package ejercicio2.clinicaVeterinaria.repositories;

import ejercicio2.clinicaVeterinaria.entities.Base;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * Repositorio base genérico para las entidades.
 *
 * @param <T> Entidad
 * @param <ID> Tipo del ID de la entidad
 */
@NoRepositoryBean
public interface BaseRepository <T extends Base, ID> extends JpaRepository<T, ID> {

    /**
     * Realiza una eliminación lógica de la entidad con el ID proporcionado.
     *
     * @param id ID de la entidad que se quiere eliminar.
     * @throws EntityNotFoundException Si no se encuentra la entidad con el ID dado.
     * @throws IllegalStateException Si la entidad ya está marcada como eliminada.
     */
    @Override
    default void deleteById(ID id) {
        T entity = findById(id).orElseThrow(() ->
                new EntityNotFoundException("Entidad con ID #" + id + " no encontrada.")
        );

        if (entity.isBaja()) {
            throw new IllegalStateException("La entidad ya está marcada como eliminada.");
        }

        entity.setBaja(true);
        save(entity);
    }

    /**
     * Encuentra todas las entidades activas (no eliminadas lógicamente).
     *
     * @return una lista de entidades con baja = false.
     */
    List<T> findAllByBajaFalse();

}
