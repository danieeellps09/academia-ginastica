package com.dio.projetinhos.academiaginastica.service;

import com.dio.projetinhos.academiaginastica.enity.form.MatriculaForm;
import com.dio.projetinhos.academiaginastica.model.Matricula;

import java.util.List;

public interface MatriculaService {

    //Cria matricula e salva no banco de dados
    // @param form - o formulario pertence aos dados para a criação no banco de dados
    // @return -  Matricula recem criado

    Matricula create (MatriculaForm form);


    // Retorna matricula no banco de dados de acordo com seu id
    // @param id retorna um id a ser exibido
    //@return - matricula de acordo com id fornecido


    Matricula get(Long id);

    // Retorna todos os Matriculas que estão exibidos no banco de dados
    // @Return uma lista com todas as matriculas no banco de dados

    List<Matricula> getAll();



    // Deleta o aluno específico

    void delete (Long id);
}
