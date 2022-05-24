package br.com.projetinho.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Parent;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

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

    @NotBlank(message = "Campo está vázio!")
    @Pattern(regexp = "^[A-Z]+(.)*", message = "A primeira letra tem que ser Maiuscula!")//A primeira letra tem que ser Maiuscula
    @Column(name = "Nome", nullable = false, length = 50)
    private String name;


}
