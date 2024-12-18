package ejercicio1.estudianteProgramacion.Entities.Dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CursoDto {

    @NotNull(message="El nombre no puede ser nulo")
    @NotBlank(message="El nombre no puede estar en blanco")
    private String nombre;


    private String modalidad;

    @NotNull(message="La fecha de finalización no puede ser nula")
    private Date fechaFinalizacion;
}