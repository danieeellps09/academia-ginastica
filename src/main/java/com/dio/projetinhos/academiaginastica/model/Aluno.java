package com.dio.projetinhos.academiaginastica.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String cpf;
    private String bairro;
    private LocalDate dataNascimento;
    @JsonIgnore
    @OneToMany (mappedBy = "aluno", fetch = FetchType.LAZY) //1 aluno para cadaa avaliacao fisica
private List <AvaliacaoFisica> avaliacoes = new ArrayList<>();





}
