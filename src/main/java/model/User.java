/**
 * Created by Mihnea-Alexandru Serban
 * Date : 30.08.2022
 * Time : 20:40
 * Project Name : Rsvti
 */
package model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID")
    private Integer id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String mail;
}
