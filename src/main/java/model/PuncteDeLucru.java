/**
 * Created by Mihnea-Alexandru Serban
 * Date : 30.08.2022
 * Time : 18:50
 * Project Name : Rsvti
 */
package model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString(exclude = "echipamente")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "puncte_lucru")
public class PuncteDeLucru {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer punctLucruId;
    private String localitate;
    private String strada;
    private String numar;
    private String judet;
    private Integer sector;
    @ManyToOne
    @JoinColumn(name = "firmeId")
    private Firme firme;

    @OneToMany(mappedBy = "puncteDeLucru")
    private Set<Echipamente> echipamente = new HashSet<>();
}
