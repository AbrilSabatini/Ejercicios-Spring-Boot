package ejercicio2.clinicaVeterinaria.services;

import ejercicio2.clinicaVeterinaria.entities.Base;

import java.util.List;

public interface BaseService<T extends Base, ID> {
    List<T> getAll();

    T getById(ID id);

    T create(T entity);

    T update(T request);

    void delete(ID id);

}
