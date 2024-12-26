package ejercicio2.clinicaVeterinaria.entities.dtos.duenioDtos;

import ejercicio2.clinicaVeterinaria.entities.dtos.BaseDto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DuenioUpdateDto extends BaseDto {
    private String dni;

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;

    @NotBlank
    private String celular;
}
