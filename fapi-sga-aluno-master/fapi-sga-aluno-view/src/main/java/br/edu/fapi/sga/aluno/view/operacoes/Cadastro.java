package br.edu.fapi.sga.aluno.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.aluno.controller.AlunoController;
import br.edu.fapi.sga.model.aluno.Aluno;

public class Cadastro {
    public void cadastrarAluno(AlunoController alunoController, Scanner scanner, Aluno aluno) {
        int opcao;
        int defCodigo = 0;
        
        do{
        System.out.println("");
        System.out.println("Digite 1 para cadastrar um aluno ou 0 para voltar.");
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                System.out.println("CADASTRO DE ALUNO.");
                do{
                    System.out.print("Digite o codigo do aluno: ");
                    aluno.setCodigo(scanner.nextInt());
                    scanner.nextLine();
                    if (aluno.getCodigo() < 0){
                        System.out.println("O código não pode ser menor que 0. Por favor digite novamente.");
                        System.out.println("");
                    }else{
                        defCodigo = 1;
                    }
                }while (defCodigo == 0);
                System.out.print("Digite o nome do aluno: ");
                aluno.setNome(scanner.nextLine());
                System.out.print("Digite o CPF do aviso: ");
                aluno.setCPF(scanner.nextLine());
                
                //Verificar quais serão os outros campos do cadastro de aluno

                alunoController.cadastrarAluno(aluno);

                System.out.println("");
                System.out.println("-------------------------------");
                System.out.println("CADASTRO REALIZADO COM SUCESSO.");
                System.out.println("-------------------------------");
                System.out.println("");
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("Opçãoo inválida.");
                System.out.println("");
                break;
            }
        }while (opcao != 0 && opcao != 1);
    }
    
}
