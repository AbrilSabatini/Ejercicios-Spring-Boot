package ejercicio2.clinicaVeterinaria.entities.dtos.mascotaDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MascotaResumenDto {
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_duenio;
    private String apellido_duenio;
}
