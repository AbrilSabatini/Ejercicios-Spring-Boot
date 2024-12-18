package ejercicio1.estudianteProgramacion.Controllers;

import ejercicio1.estudianteProgramacion.Entities.Dtos.Mappers.TemaMapper;
import ejercicio1.estudianteProgramacion.Entities.Dtos.TemaDto;
import ejercicio1.estudianteProgramacion.Entities.Dtos.TemaUpdateDto;
import ejercicio1.estudianteProgramacion.Entities.Tema;
import ejercicio1.estudianteProgramacion.Services.ITemaService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temas")
public class TemaController {

    @Autowired
    private ITemaService temaService;

    @Autowired
    private TemaMapper temaMapper;

    @Operation(summary = "Crear un tema")
    @PostMapping("/")
    public Tema create(@Valid @RequestBody TemaDto temaDto) {
        Tema tema = temaMapper.toEntity(temaDto);
        return temaService.create(tema);
    }

    @Operation(summary = "Obtener todos los temas de un determinado curso")
    @GetMapping("/{cursoId}")
    public List<Tema> getByCursoId(@PathVariable Long cursoId){
        return temaService.getByCursoId(cursoId);
    }

    @Operation(summary = "Editar un tema")
    @PatchMapping("/")
    public Tema update(@Valid @RequestBody TemaUpdateDto temaDto) {
        Tema tema = temaMapper.toEntity(temaDto);
        return temaService.update(tema);
    }
}
