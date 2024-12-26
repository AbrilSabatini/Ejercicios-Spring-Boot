package ejercicio2.clinicaVeterinaria.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PreRemove;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Duenio extends Base {
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;

    @OneToMany(mappedBy = "duenio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mascota> mascotas;

}
