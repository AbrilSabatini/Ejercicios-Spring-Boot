package ejercicio2.clinicaVeterinaria.controllers;

import ejercicio2.clinicaVeterinaria.entities.Mascota;
import ejercicio2.clinicaVeterinaria.entities.dtos.BaseMapper;
import ejercicio2.clinicaVeterinaria.entities.dtos.mascotaDtos.*;
import ejercicio2.clinicaVeterinaria.services.BaseService;
import ejercicio2.clinicaVeterinaria.services.MascotaService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotaController extends BaseController<Mascota, Long, MascotaCreateDto, MascotaUpdateDto, MascotaResponseDto>{
    private final MascotaMapper mascotaMapper;
    private final MascotaService mascotaService;

    public MascotaController(BaseService<Mascota, Long> baseService, BaseMapper<Mascota, MascotaCreateDto, MascotaUpdateDto, MascotaResponseDto> baseMapper, MascotaMapper mascotaMapper, MascotaService mascotaService) {
        super(baseService, baseMapper);
        this.mascotaMapper = mascotaMapper;
        this.mascotaService = mascotaService;
    }

    /*@Operation(summary = "Guardar entidad asociada a un nuevo dueño")
    @PostMapping("/with-duenio")
    public ResponseEntity<MascotaResponseDto> createWithDuenio(@RequestBody @Valid MascotaCreateWithDuenioDto createDto) {
        Mascota entity = mascotaMapper.toEntityFromMascotaWithDuenio(createDto);
        MascotaResponseDto dto = mascotaMapper.toDto(mascotaService.create(entity));
        return ResponseEntity.status(201).body(dto);
    }*/

    @Operation(summary = "Obtener todas las mascotas de determinada especie")
    @GetMapping("/by-especie/{especie}")
    ResponseEntity<List<MascotaResponseDto>> getByEspecie(@PathVariable String especie) {
        List<MascotaResponseDto> mascotasDto = mascotaMapper.toDtoList(mascotaService.getByEspecie(especie));
        return ResponseEntity.ok(mascotasDto);
    }

    @Operation(summary = "Obtener todas las mascotas de determinada raza")
    @GetMapping("/by-raza/{raza}")
    ResponseEntity<List<MascotaResponseDto>> getByRaza(@PathVariable String raza) {
        List<MascotaResponseDto> mascotasDto = mascotaMapper.toDtoList(mascotaService.getByRaza(raza));
        return ResponseEntity.ok(mascotasDto);
    }

    @Operation(summary = "Obtener un resumen con los datos combinados de la mascota y su dueño")
    @GetMapping("/resumen")
    ResponseEntity<List<MascotaResumenDto>> getResumen() {
        List<MascotaResumenDto> mascotasDto = mascotaMapper.mascotaListToMascotaResumenDtoList(mascotaService.getAll());
        return ResponseEntity.ok(mascotasDto);
    }

}
