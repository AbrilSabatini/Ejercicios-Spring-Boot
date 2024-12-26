package ejercicio2.clinicaVeterinaria.entities.dtos.mascotaDtos;

import ejercicio2.clinicaVeterinaria.entities.dtos.duenioDtos.DuenioResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MascotaResponseDto {

    private String nombre;
    private String especie;
    private String raza;
    private String color;

    private DuenioResponseDto duenio;
}
