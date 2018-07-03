package br.edu.fapi.sga.turma.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.turma.Turma;
import br.edu.fapi.sga.turma.controller.TurmaController;

public class Pesquisa {
    public void pesquisarAviso(TurmaController turmaController, Scanner scanner, Turma turma) {
        int opcao;
        int defCodigo = 0;
        int codigo;
        
        do{
        System.out.println("");
        System.out.println("Digite 1 para pesquisar uma turma ou 0 para voltar.");
        opcao = scanner.nextInt();
        scanner.nextLine();
                
        switch (opcao) {
            case 1:
                do{
                    System.out.println("");
                    System.out.print("Digite o código da turma que deseja pesquisar: ");
                    codigo = scanner.nextInt();
                    scanner.nextLine();
                    if (codigo < 0){
                        System.out.println("O código pesquisado não pode ser menor que 0. Por favor digite novamente.");
                        System.out.println("");
                    }else{
                        defCodigo = 1;
                    }
                }while (defCodigo == 0);
                if (codigo == turma.getCodigo()){
                	turmaController.pesquisarTurma(turma);

                    System.out.println("");
                    System.out.println("Código: "+turma.getCodigo());
                    System.out.println("Nome: "+turma.getDescricao());
                    System.out.println("ID: "+turma.getId());
                    System.out.println("");
                }else{
                    System.out.println("");
                    System.out.println("Aviso não encontrado.");
                    System.out.println("");
                }
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("Opção inválida.");
                System.out.println("");
                break;
            }
        }while (opcao != 0 && opcao != 1);
    }    
}