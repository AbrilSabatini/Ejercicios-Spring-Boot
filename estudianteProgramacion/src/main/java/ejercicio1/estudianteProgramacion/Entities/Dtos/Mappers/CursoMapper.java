package ejercicio1.estudianteProgramacion.Entities.Dtos.Mappers;

import ejercicio1.estudianteProgramacion.Entities.Curso;
import ejercicio1.estudianteProgramacion.Entities.Dtos.CursoDto;
import ejercicio1.estudianteProgramacion.Entities.Dtos.CursoUpdateDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CursoMapper {
    Curso toEntity(CursoDto cursoDto);

    CursoDto toDto(Curso curso);

    Curso toEntity(CursoUpdateDto cursoDto);
}
