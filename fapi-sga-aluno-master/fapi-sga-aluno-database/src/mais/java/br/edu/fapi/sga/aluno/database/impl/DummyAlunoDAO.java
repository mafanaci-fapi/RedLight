package br.edu.fapi.sga.aluno.database.impl;

import br.edu.fapi.sga.aluno.database.AlunoDAO;
import br.edu.fapi.sga.model.aluno.Aluno;

import java.util.ArrayList;
import java.util.List;

public class DummyAlunoDAO implements AlunoDAO {

    @Override
    public int create(Aluno aluno) {
        System.out.println("Data Layer -> Aluno cadastrado com sucesso");
        return 1;
    }

    @Override
    public Aluno retrieve(Aluno aluno) {
        System.out.println("Data Layer -> Aluno pesquisado com sucesso");
        Aluno alunoResultado = new Aluno();
        alunoResultado.setCodigo(1);
        alunoResultado.setConteudo("Teste Conteudo");
        alunoResultado.setTitulo("Teste Titulo");
        return alunoResultado;
    }

    @Override
    public List<Aluno> retrieveList(Aluno aluno) {
        System.out.println("Data Layer -> Alunos pesquisados com sucesso");

        Aluno alunoResultado1 = new Aluno();
        alunoResultado1.setCodigo(1);
        alunoResultado1.setConteudo("Teste Conteudo 1");
        alunoResultado1.setTitulo("Teste Titulo 1");

        Aluno alunoResultado2 = new Aluno();
        alunoResultado2.setCodigo(1);
        alunoResultado2.setConteudo("Teste Conteudo 2");
        alunoResultado2.setTitulo("Teste Titulo 2");

        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(alunoResultado1);
        listaAlunos.add(alunoResultado2);

        return listaAlunos;
    }

    @Override
    public int update(Aluno aluno) {
        System.out.println("Data Layer -> Aluno atualizado com sucesso");
        return 1;
    }

    @Override
    public int delete(Aluno aluno) {
        System.out.println("Data Layer -> Aluno apagado com sucesso");
        return 1;
    }
}
