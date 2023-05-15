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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString(exclude = "autorizari")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "echipamente_ir")
public class Echipamente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer echipamenteId;
    private String tipEchipament;

    private String modelEchipament;
    private String nrSerie;
    private LocalDate anFabricatie;
    private Integer sarcinaNominala;
    private Integer inaltimeaMax;
    private Integer razaMax;
    private Integer statii;

    @ManyToOne
    @JoinColumn(name = "punctLucruId")
    private PuncteDeLucru puncteDeLucru;

    @OneToMany(mappedBy = "echipamente")
    private Set<Autorizari> autorizari = new HashSet<>();

}
