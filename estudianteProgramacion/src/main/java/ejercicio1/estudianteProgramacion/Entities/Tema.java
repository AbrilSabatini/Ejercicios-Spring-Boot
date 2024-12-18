package ejercicio1.estudianteProgramacion.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ejercicio1.estudianteProgramacion.Entities.Dtos.TemaDto;
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
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_tema")
    private Long id;

    private String nombre;

    private String descripcion;

    @ManyToOne()
    @JoinColumn(name = "id_curso")
    @JsonIgnore
    private Curso curso;

}
