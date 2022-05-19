package br.com.projetinho.model;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Nome")
    private String name;
    private String voto; //null


}
