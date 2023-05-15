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
@ToString(exclude = "puncteDeLucru")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lista_firme")
public class Firme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer firmeId;

//    @Column(unique = true, nullable = false)
    private String numeFirma;

    private Integer cui;

    private String recom;

    @OneToMany(mappedBy = "firme")
    private Set<PuncteDeLucru> puncteDeLucru = new HashSet<>();

}
