package ejercicio2.clinicaVeterinaria.services.implementations;

import ejercicio2.clinicaVeterinaria.entities.Duenio;
import ejercicio2.clinicaVeterinaria.repositories.BaseRepository;
import ejercicio2.clinicaVeterinaria.repositories.DuenioRepository;
import ejercicio2.clinicaVeterinaria.repositories.MascotaRepository;
import ejercicio2.clinicaVeterinaria.services.DuenioService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class DuenioServiceImpl extends BaseServiceImpl<Duenio, Long> implements DuenioService {
    private final DuenioRepository duenioRepository;

    public DuenioServiceImpl(BaseRepository<Duenio, Long> baseRepository, DuenioRepository duenioRepository) {
        super(baseRepository);
        this.duenioRepository = duenioRepository;
    }

    @Transactional
    @Override
    public void delete(Long id) {
        Duenio duenio = duenioRepository.findByIdAndBaja(id, false);
        if (duenio == null) {
            throw new EntityNotFoundException("Entidad con ID #" + id + " no encontrada o dada de baja");
        }

        duenio.getMascotas().forEach(mascota -> {
            if (!mascota.isBaja()) mascota.setBaja(true);
        });

        duenio.setBaja(true);
        duenioRepository.save(duenio);
    }
}
