package ejercicio1.estudianteProgramacion.Entities.Dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseDto {

    @NotNull(message="El id no puede ser nulo")
    private Long id;

}
