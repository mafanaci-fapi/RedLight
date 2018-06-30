package br.edu.fapi.sga.aluno.view.operacoes;

import br.edu.fapi.sga.aluno.controller.AlunoController;
import br.edu.fapi.sga.model.aluno.Aluno;

public class Listar {
    public void listarAluno(AlunoController alunoController, Aluno aluno) {
        if (aluno.getCodigo()== -1){
            System.out.println("");
            System.out.println("Não há alunos cadastrados.");
            System.out.println("");
        }else{
            alunoController.pesquisarListaAlunos(aluno);

            System.out.println("");
            System.out.println("----------------");
            System.out.println("LISTA DE ALUNOS.");
            System.out.println("----------------");
            System.out.println(aluno.getNome());
            System.out.println(" --- ");
            System.out.println("");
        }
    }
    
}
