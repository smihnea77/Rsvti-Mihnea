/**
 * Created by Mihnea-Alexandru Serban
 * Date : 30.08.2022
 * Time : 18:51
 * Project Name : Rsvti
 */
package model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autorizari_ir")
public class Autorizari {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer autorizariId;
    private String nrSerie;
    private LocalDate dataAutorizare;
    private LocalDate scadenta;
    private String nrRaport;

    @ManyToOne
    @JoinColumn(name = "echipamenteId")
    private Echipamente echipamente;
}
