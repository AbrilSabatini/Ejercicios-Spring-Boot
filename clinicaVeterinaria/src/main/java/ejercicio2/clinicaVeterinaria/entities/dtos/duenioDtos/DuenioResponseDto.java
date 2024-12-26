package ejercicio2.clinicaVeterinaria.entities.dtos.duenioDtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DuenioResponseDto {
    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dni;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nombre;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String apellido;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String celular;
}
