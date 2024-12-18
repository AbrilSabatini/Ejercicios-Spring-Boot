package ejercicio1.estudianteProgramacion.Entities.Dtos.Mappers;

import ejercicio1.estudianteProgramacion.Entities.Dtos.TemaDto;
import ejercicio1.estudianteProgramacion.Entities.Dtos.TemaUpdateDto;
import ejercicio1.estudianteProgramacion.Entities.Tema;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TemaMapper {
    Tema toEntity(TemaDto temaDto);

    TemaDto toDto(Tema tema);

    Tema toEntity(TemaUpdateDto temaUpdateDto);

}
