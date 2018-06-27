package br.edu.fapi.sga.aluno.business;

import br.edu.fapi.sga.aluno.database.AlunoDAO;
import br.edu.fapi.sga.aluno.database.impl.DummyAlunoDAO;
import br.edu.fapi.sga.model.aluno.Aluno;

import java.util.List;

public class AlunoBusinessImpl implements AlunoBusiness{

    private AlunoDAO alunoDAO;

    public AlunoBusinessImpl(){
        this.alunoDAO = new DummyAlunoDAO();
    }

    public void setAlunoDAO(AlunoDAO alunoDAO) {
        this.alunoDAO = alunoDAO;
    }

    @Override
    public int cadastrarAluno(Aluno aluno) {

        if(aluno != null){
            return alunoDAO.create(aluno);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }

    @Override
    public Aluno pesquisarAluno(Aluno aluno) {
        
    	if(aluno != null){
            return alunoDAO.retrieve(aluno);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }

    @Override
    public List<Aluno> pesquisarListaAlunos(Aluno aluno) {
        if(aluno != null){
            return alunoDAO.retrieveList(aluno);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }

    @Override
    public int atualizarAluno(Aluno aluno) {
        if(aluno != null){
            return alunoDAO.update(aluno);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }

    @Override
    public int excluirAluno(Aluno aluno) {
        if(aluno != null){
            return alunoDAO.delete(aluno);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }
}
