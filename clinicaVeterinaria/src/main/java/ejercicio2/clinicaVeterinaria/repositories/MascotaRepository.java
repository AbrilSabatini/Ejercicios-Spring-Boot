package ejercicio2.clinicaVeterinaria.repositories;

import ejercicio2.clinicaVeterinaria.entities.Mascota;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MascotaRepository extends BaseRepository<Mascota, Long> {
    /**
     * Retorna las mascotas que coincidan con la especie dada.
     *
     * @param especie especie de las mascotas que se quiere obtener
     * @return lista de mascotas que coincida con la especie dada
     */
    List<Mascota> findByEspecie(String especie);

    /**
     * Retorna las mascotas que coincidan con la especie dada.
     *
     * @param raza raza de las mascotas que se quiere obtener
     * @return lista de mascotas que coincida con la raza dada
     */
    List<Mascota> findByRaza(String raza);
}
