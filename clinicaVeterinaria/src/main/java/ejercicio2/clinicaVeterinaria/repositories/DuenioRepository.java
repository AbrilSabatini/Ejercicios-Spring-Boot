package ejercicio2.clinicaVeterinaria.repositories;

import ejercicio2.clinicaVeterinaria.entities.Duenio;
import org.springframework.stereotype.Repository;

@Repository
public interface DuenioRepository extends BaseRepository<Duenio, Long> {
    /**
     * Busca el Dunio que cumpla con los parámetros de ID y de baja dados.
     *
     * @param id ID de la entidad que se quiere obtener
     * @param baja valor booleano que marca la eliminación lógica
     * @return entidad Duenio que cumpla con los parámetros dados
     */
    Duenio findByIdAndBaja(Long id, Boolean baja);
}
