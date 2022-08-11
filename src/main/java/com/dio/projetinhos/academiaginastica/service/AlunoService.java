package com.dio.projetinhos.academiaginastica.service;

import com.dio.projetinhos.academiaginastica.enity.form.AlunoForm;
import com.dio.projetinhos.academiaginastica.enity.form.AlunoUpdateForm;
import com.dio.projetinhos.academiaginastica.model.Aluno;

import java.util.List;

public interface AlunoService {
    //Cria um aluno e salva no banco de dados
    // @param form - o formulario pertence aos dados para a criação no banco de dados
    // @return -  Aluno recem criado

    Aluno create (AlunoForm form);


    // Retorna um aluno no banco de dados de acordo com seu id
    // @param id retorna um id a ser exibido
    //@return - aluno de acordo com id fornecido


    Aluno get(Long id);

    // Retorna todos os Alunos que estão exibidos no banco de dados
    // @Return uma lista com todas as avalições fisicas no banco de dados

    List<Aluno> getAll();
    //Atualiza o aluno
    //@param id -id do aluno que sera atualizado
    // formUpdate - formulario referente aos dados necessários para atualizar o formulario
    // @return aluno recem atualizado

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    // Deleta o aluno específico

    void delete (Long id);



}
