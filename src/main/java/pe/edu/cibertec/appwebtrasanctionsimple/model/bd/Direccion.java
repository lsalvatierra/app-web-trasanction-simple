package pe.edu.cibertec.appwebtrasanctionsimple.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descripcion;
    @OneToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;
}
