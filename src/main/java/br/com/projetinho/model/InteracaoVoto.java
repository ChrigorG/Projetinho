package br.com.projetinho.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "InteracaoVoto")
public class InteracaoVoto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long id_user,id_pauta;

    @NotBlank(message = "Campo voto está vázio! Informe seu voto.")
    @Pattern(regexp = "^[A-Z]+(.)*", message = "A primeira letra tem que ser Maiuscula!") //A primeira letra tem que ser Maiuscula
    @Column(nullable = false, length = 3)
    private String voto;

    private int cont_voto;



}
