package ejercicio2.clinicaVeterinaria.services;

import ejercicio2.clinicaVeterinaria.entities.Mascota;

import java.util.List;

public interface MascotaService extends BaseService<Mascota, Long> {
    List<Mascota> getByEspecie(String especie);

    List<Mascota> getByRaza(String raza);

}
