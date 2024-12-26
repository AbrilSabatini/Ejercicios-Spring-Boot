package ejercicio2.clinicaVeterinaria.entities.dtos.mascotaDtos;

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
public class MascotaUpdateDto extends BaseDto {
    @NotBlank
    private String nombre;

    @NotBlank
    private String especie;

    @NotBlank
    private String raza;

    @NotBlank
    private String color;

    private BaseDto duenio;
}
