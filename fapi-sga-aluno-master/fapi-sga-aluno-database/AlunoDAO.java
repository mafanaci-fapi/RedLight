package br.edu.fapi.sga.aluno.database;

import br.edu.fapi.sga.model.aluno.Aluno;

import java.util.List;

public interface AlunoDAO {

    //CRUD - Create Retrieve Update Delete
    //Cadastrar Buscar Atualizar Apagar

    int create(Aluno aluno);

    Aluno retrieve(Aluno aluno);

    List<Aluno> retrieveList(Aluno aluno);

    int update(Aluno aluno);

    int delete(Aluno aluno);

}
