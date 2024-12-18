package ejercicio1.estudianteProgramacion.Entities.Dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TemaUpdateDto {

    @NotNull(message="El id no puede ser nulo")
    @NotBlank(message="El id no puede estar en blanco")
    private Long id;

    @NotNull(message = "El nombre no puede ser nulo")
    @NotBlank(message = "El nombre no puede estar en blanco")
    private String nombre;

    private String descripcion;

    @NotNull(message="El curso no puede ser nulo")
    private BaseDto curso;
}
