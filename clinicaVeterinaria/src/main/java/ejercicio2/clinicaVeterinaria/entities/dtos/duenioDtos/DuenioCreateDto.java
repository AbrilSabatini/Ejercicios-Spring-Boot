package ejercicio2.clinicaVeterinaria.entities.dtos.duenioDtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DuenioCreateDto {
    private String dni;

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;

    @NotBlank
    private String celular;
}
