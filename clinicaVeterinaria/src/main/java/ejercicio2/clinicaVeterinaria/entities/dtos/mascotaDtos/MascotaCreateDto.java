package ejercicio2.clinicaVeterinaria.entities.dtos.mascotaDtos;

import ejercicio2.clinicaVeterinaria.entities.dtos.BaseDto;
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
public class MascotaCreateDto {
    @NotBlank
    private String nombre;

    @NotBlank
    private String especie;

    @NotBlank
    private String raza;

    @NotBlank
    private String color;

    @NotNull
    private BaseDto duenio;
}
