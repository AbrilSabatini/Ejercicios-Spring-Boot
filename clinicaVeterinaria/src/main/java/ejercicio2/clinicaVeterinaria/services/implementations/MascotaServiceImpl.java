package ejercicio2.clinicaVeterinaria.services.implementations;

import ejercicio2.clinicaVeterinaria.entities.Mascota;
import ejercicio2.clinicaVeterinaria.repositories.BaseRepository;
import ejercicio2.clinicaVeterinaria.repositories.MascotaRepository;
import ejercicio2.clinicaVeterinaria.services.MascotaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaServiceImpl extends BaseServiceImpl<Mascota, Long> implements MascotaService {
    private final MascotaRepository mascotaRepository;

    public MascotaServiceImpl(BaseRepository<Mascota, Long> baseRepository, MascotaRepository mascotaRepository) {
        super(baseRepository);
        this.mascotaRepository = mascotaRepository;
    }

    @Override
    public List<Mascota> getByEspecie(String especie) {
        return mascotaRepository.findByEspecie(especie);
    }

    @Override
    public List<Mascota> getByRaza(String raza) {
        return mascotaRepository.findByRaza(raza);
    }

}
