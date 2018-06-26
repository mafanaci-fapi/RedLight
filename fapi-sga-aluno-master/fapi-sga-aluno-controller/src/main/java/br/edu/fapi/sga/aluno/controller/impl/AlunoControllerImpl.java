package br.edu.fapi.sga.aluno.controller.impl;

import br.edu.fapi.sga.aluno.business.AlunoBusinessImpl;
import br.edu.fapi.sga.aluno.controller.AlunoController;
import br.edu.fapi.sga.model.aluno.Aluno;

import java.util.List;

public class AlunoControllerImpl implements AlunoController {

    private AlunoBusinessImpl alunoBusiness;

    public AlunoControllerImpl() {
        this.alunoBusiness = new AlunoBusinessImpl();
    }

    public void setAlunoBusiness(AlunoBusinessImpl alunoBusiness) {
        this.alunoBusiness = alunoBusiness;
    }

    @Override
    public int cadastrarAluno(Aluno aluno) {
        return alunoBusiness.cadastrarAluno(aluno);
    }

    @Override
    public Aluno pesquisarAluno(Aluno aluno) {
        return alunoBusiness.pesquisarAluno(aluno);
    }

    @Override
    public List<Aluno> pesquisarListaAlunos(Aluno aluno) {
        return alunoBusiness.pesquisarListaAlunos(aluno);
    }

    @Override
    public int atualizarAluno(Aluno aluno) {
        return alunoBusiness.atualizarAluno(aluno);
    }

    @Override
    public int excluirAluno(Aluno aluno) {
        return alunoBusiness.excluirAluno(aluno);
    }
}
