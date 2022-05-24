package br.com.projetinho.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Pauta")
public class Pauta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Campo está vázio!") // Não deixa o campo ser vázia e ter espaço inicial
    @Pattern(regexp = "^[A-Z]+(.)*", message = "A primeira letra tem que ser Maiuscula!")//A primeira letra tem que ser Maiuscula
    @Column(name = "Pauta",nullable = false, length = 50)
    private String namePauta;

}
