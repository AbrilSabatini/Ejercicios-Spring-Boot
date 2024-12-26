package ejercicio2.clinicaVeterinaria.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mascota extends Base {
    private String nombre;
    private String especie;
    private String raza;
    private String color;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "duenio_id")
    private Duenio duenio;
}
