package com.dio.projetinhos.academiaginastica.service;

import com.dio.projetinhos.academiaginastica.enity.form.AlunoForm;
import com.dio.projetinhos.academiaginastica.enity.form.AvaliacaoFisicaForm;

import java.util.List;

public interface AvaliacaoFisica {
    //Cria um aluno e salva no banco de dados
    // @param form - o formulario pertence aos dados para a criação no banco de dados
    // @return -  Aluno recem criado

    AvaliacaoFisica create (AlunoForm form);


    // Retorna um aluno no banco de dados de acordo com seu id
    // @param id retorna um id a ser exibido
    //@return - matricula de acordo com id fornecido


    AvaliacaoFisica get(Long id);

    // Retorna todos as AvaliacoesFisica que estão exibidos no banco de dados
    // @Return uma lista com todas as avalições fisicas no banco de dados

    List<AvaliacaoFisica> getAll();
    //Atualiza o aluno
    //@param id -id da AvaliacaoFisica que sera atualizada
    // formUpdate - formulario referente aos dados necessários para atualizar o formulario
    // @return avaliacao fisica recem  atualizada

    AvaliacaoFisica update(Long id, AvaliacaoFisicaForm formUpdate);

    // Deleta a avaliacao fisica específico

    void delete (Long id);
}
