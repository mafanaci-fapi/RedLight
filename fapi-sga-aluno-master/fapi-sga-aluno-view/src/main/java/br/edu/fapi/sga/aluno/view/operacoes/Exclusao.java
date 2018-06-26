package br.edu.fapi.sga.aluno.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.aluno.controller.AlunoController;
import br.edu.fapi.sga.model.aluno.Aluno;

public class Exclusao {
    public void excluirAluno(AlunoController alunoController, Scanner scanner, Aluno aluno) {
        int opcao;
        int codigo;
        int defCodigo = 0;
        
        do {       
        System.out.println("");
        System.out.println("Digite 1 para excluir um aluno ou 0 para voltar.");
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                System.out.println("");
                System.out.println("EXCLUSÃO DE ALUNO.");
                do{
                    System.out.print("Digite o codigo do aluno que deseja excluir: ");
                    codigo = scanner.nextInt();
                    scanner.nextLine();
                    if (codigo < 0){
                        System.out.println("O código digitado não pode ser menor que 0. Por favor digite novamente.");
                        System.out.println("");
                    }else{
                        defCodigo = 1;
                    }
                } while (defCodigo == 0);
                if (codigo == aluno.getCodigo()){
                    aluno.setCodigo(-1);

                    alunoController.excluirAluno(aluno);

                    System.out.println("");
                    System.out.println("---------------------------");
                    System.out.println("ALUNO EXCLUIDO COM SUCESSO.");
                    System.out.println("---------------------------");
                    System.out.println("");
                }else{
                    System.out.println("");
                    System.out.println("Aluno não encontrado");
                    System.out.println("");
                }       
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("Opçãoo inválida");
                System.out.println("");
                break;
            }
        }while (opcao != 0 && opcao != 1);
    }
    
}
