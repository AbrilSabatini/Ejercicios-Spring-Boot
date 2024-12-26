package ejercicio2.clinicaVeterinaria.entities.dtos.mascotaDtos;

import ejercicio2.clinicaVeterinaria.entities.Mascota;
import ejercicio2.clinicaVeterinaria.entities.dtos.BaseMapper;
import ejercicio2.clinicaVeterinaria.entities.dtos.duenioDtos.DuenioMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DuenioMapper.class})
public interface MascotaMapper extends BaseMapper<Mascota, MascotaCreateDto, MascotaUpdateDto, MascotaResponseDto> {
    Mascota toEntityFromMascotaWithDuenio(MascotaCreateWithDuenioDto dto);


    @Mapping(target = "nombre_mascota", source = "nombre")
    @Mapping(target = "nombre_duenio", source = "duenio.nombre")
    @Mapping(target = "apellido_duenio", source = "duenio.apellido")
    MascotaResumenDto mascotaToMascotaResumenDto(Mascota mascota);

    List<MascotaResumenDto> mascotaListToMascotaResumenDtoList(List<Mascota> mascotaList);

}