package ejercicio1.estudianteProgramacion.Controllers;

import ejercicio1.estudianteProgramacion.Entities.Curso;
import ejercicio1.estudianteProgramacion.Entities.Dtos.CursoDto;
import ejercicio1.estudianteProgramacion.Entities.Dtos.CursoUpdateDto;
import ejercicio1.estudianteProgramacion.Entities.Dtos.Mappers.CursoMapper;
import ejercicio1.estudianteProgramacion.Services.ICursoService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private ICursoService cursoService;

    @Autowired
    private CursoMapper cursoMapper;

    @Operation(summary = "Listar todos los cursos y sus temas")
    @GetMapping("/")
    public List<Curso> getAll() {
        return cursoService.getAll();
    }

    @Operation(summary = "Crear un curso")
    @PostMapping("/")
    public Curso create(@Valid @RequestBody CursoDto curso) {
        Curso entity = cursoMapper.toEntity(curso);
        return cursoService.create(entity);
    }

    @Operation(summary = "Obtener todos los cursos que contengan la palabra dada")
    @GetMapping("/{nombreCurso}")
    public List<Curso> getAllByNombre(@PathVariable String nombreCurso) {
        return cursoService.getAllByNombre(nombreCurso);
    }

    @Operation(summary = "Editar un curso")
    @PatchMapping("/")
    public Curso update(@Valid @RequestBody CursoUpdateDto curso) {
        Curso entity = cursoMapper.toEntity(curso);
        return cursoService.update(entity);
    }
}
