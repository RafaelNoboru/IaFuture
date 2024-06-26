package br.com.fiap.IaFuture.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Entity
@Data
public class Cadastro {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_cadastro;

    @NotBlank
    private String nome;
    
    @NotBlank
    private String telefone;

    @NotBlank
    private String cnpj;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    @JsonIgnore
    @OneToOne(mappedBy = "cadastro")
    private Conta conta;

}

