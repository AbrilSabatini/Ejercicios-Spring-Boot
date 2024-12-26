package ejercicio2.clinicaVeterinaria.entities.dtos.duenioDtos;

import ejercicio2.clinicaVeterinaria.entities.Duenio;
import ejercicio2.clinicaVeterinaria.entities.dtos.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DuenioMapper extends BaseMapper<Duenio, DuenioCreateDto, DuenioUpdateDto, DuenioResponseDto> {
}
