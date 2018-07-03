package br.edu.fapi.sga.turma.view.operacoes;

import br.edu.fapi.sga.model.turma.Turma;
import br.edu.fapi.sga.turma.controller.TurmaController;

public class Listar {
    public void listarAviso(TurmaController turmaController, Turma turma) {
        if (turma.getCodigo()== -1){
            System.out.println("");
            System.out.println("Não existem turmas cadastradas.");
            System.out.println("");
        }else{
        	turmaController.pesquisarListaTurma(turma);

            System.out.println("");
            System.out.println("----------------");
            System.out.println("LISTA DE TURMAS.");
            System.out.println("----------------");
            System.out.println(turma.getDescricao());
            System.out.println(" --- ");
            System.out.println("");
        }
    }   
}