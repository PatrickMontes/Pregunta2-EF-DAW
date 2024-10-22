package pe.edu.cibertec.pregunta2efdaw.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int vacantes;

    @Column(name = "ciclo_requerido")
    private int cicloRequerido;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

}
