package br.edu.fapi.sga.aluno.controller;

import br.edu.fapi.sga.model.aluno.Aluno;

import java.util.List;

public interface AlunoController {

    int cadastrarAluno(Aluno aluno);

    Aluno pesquisarAluno(Aluno aluno);

    List<Aluno> pesquisarListaAlunos(Aluno aluno);

    int atualizarAluno(Aluno aluno);

    int excluirAluno(Aluno aluno);

}
