package br.edu.fapi.sga.turma.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.turma.Turma;
import br.edu.fapi.sga.turma.controller.TurmaController;

public class Atualiza {
	public void atualizarAviso(TurmaController turmaController, Scanner scanner, Turma turma) {
        int opcao;
        int codigo;
        int defCodigo = 0;
        
        do{
        System.out.println("");
        System.out.println("Digite 1 para atualizar uma turma ou 0 para voltar.");
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                System.out.println("");
                System.out.println("ATUALIZA��O DAS TURMAS.");
                do {
                    System.out.print("Digite o c�digo da turma que deseja atualizar: ");
                    codigo = scanner.nextInt();
                    scanner.nextLine();
                    if (codigo < 0){
                        System.out.println("O c�digo digitado n�o pode ser menor que 0. Por favor digite novamente.");
                        System.out.println("");
                    }else{
                        defCodigo = 1;
                    }
                } while (defCodigo == 0);
                if (codigo == turma.getCodigo()){
                    System.out.println("");
                    System.out.println("ALTERA��ES DAS INFORMA��ES DA TURMA: "+codigo);
                    System.out.print("Digite o novo nome da Turma: ");
                    turma.setDescricao(scanner.nextLine());
                    
                    turmaController.cadastrarTurma(turma);

                    System.out.println("");                       
                    System.out.println("----------------------------------");
                    System.out.println("ATUALIZA��O REALIZADA COM SUCESSO.");
                    System.out.println("----------------------------------");
                    System.out.println("");
                }else{
                    System.out.println("");
                    System.out.println("Turma n�o encontrada");
                    System.out.println("");
                }

                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("Op��o invalida.");
                System.out.println("");
                break;
            }
        }while (opcao != 0 && opcao != 1);
    }
    
}