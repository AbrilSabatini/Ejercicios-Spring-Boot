package ejercicio2.clinicaVeterinaria.controllers;

import ejercicio2.clinicaVeterinaria.entities.Duenio;
import ejercicio2.clinicaVeterinaria.entities.dtos.BaseMapper;
import ejercicio2.clinicaVeterinaria.entities.dtos.duenioDtos.DuenioCreateDto;
import ejercicio2.clinicaVeterinaria.entities.dtos.duenioDtos.DuenioResponseDto;
import ejercicio2.clinicaVeterinaria.entities.dtos.duenioDtos.DuenioUpdateDto;
import ejercicio2.clinicaVeterinaria.services.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/duenios")
public class DuenioController extends BaseController<Duenio, Long, DuenioCreateDto, DuenioUpdateDto, DuenioResponseDto> {
    public DuenioController(BaseService<Duenio, Long> baseService, BaseMapper<Duenio, DuenioCreateDto, DuenioUpdateDto, DuenioResponseDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
