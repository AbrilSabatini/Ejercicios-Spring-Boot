package ejercicio2.clinicaVeterinaria.services.implementations;

import ejercicio2.clinicaVeterinaria.entities.Base;
import ejercicio2.clinicaVeterinaria.repositories.BaseRepository;
import ejercicio2.clinicaVeterinaria.services.BaseService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
@RequiredArgsConstructor
public abstract class BaseServiceImpl<T extends Base, ID extends Serializable> implements BaseService<T, ID> {
    private final BaseRepository<T, ID> baseRepository;

    @Override
    public List<T> getAll() {
        return baseRepository.findAllByBajaFalse();
    }

    @Override
    public T getById(ID id) {
        return (T) baseRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Entidad con ID #" + id + " no encontrada.")
        );
    }

    @Override
    public T create(T entity) {
        return (T) baseRepository.save(entity);
    }

    @Override
    public T update(T request) {
        if(baseRepository.existsById((ID) request.getId())) {
            throw new EntityNotFoundException("Entidad con ID #" + request.getId() + " no encontrada.");
        }

        return (T) baseRepository.save(request);
    }

    @Override
    public void delete(ID id) {
        baseRepository.deleteById(id);
    }
}
