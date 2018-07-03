package br.edu.fapi.sga.turma.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.turma.Turma;
import br.edu.fapi.sga.turma.controller.TurmaController;

public class Cadastro {

    public void cadastrarTurma(TurmaController turmaController, Scanner scanner, Turma turma) {
        int opcao;
        int defCodigo = 0;
        
        do{
        System.out.println("");
        System.out.println("Digite 1 para cadastrar uma nova turma ou 0 para voltar.");
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                System.out.println("CADASTRO DE TURMAS.");
                do{
                    System.out.print("Digite o codigo da nova turma: ");
                    turma.setCodigo(scanner.nextInt());
                    scanner.nextLine();
                    if (turma.getCodigo() < 0){
                        System.out.println("O código não pode ser menor que 0. Por favor digite novamente.");
                        System.out.println("");
                    }else{
                        defCodigo = 1;
                    }
                }while (defCodigo == 0);
                System.out.print("Digite o nome da nova turma: ");
                turma.setDescricao(scanner.nextLine());
                
                turmaController.cadastrarTurma(turma);

                System.out.println("");
                System.out.println("-----------------------------");
                System.out.println("TURMA CADASTRADA COM SUCESSO.");
                System.out.println("-----------------------------");
                System.out.println("");
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("opção invalida.");
                System.out.println("");
                break;
            }
        }while (opcao != 0 && opcao != 1);
    }
    
}