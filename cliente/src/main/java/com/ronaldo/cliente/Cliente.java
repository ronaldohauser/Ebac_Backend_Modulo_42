package com.ronaldo.cliente;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome não pode ser vazio")
    private String nome;

    @NotBlank(message = "O email não pode ser vazio")
    @Email(message = "Email deve ser válido")
    private String email;

    // Getters e Setters
}
