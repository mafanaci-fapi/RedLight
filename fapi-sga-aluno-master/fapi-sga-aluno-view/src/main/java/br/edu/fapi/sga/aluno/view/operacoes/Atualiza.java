package br.edu.fapi.sga.aluno.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.aluno.controller.AlunoController;
import br.edu.fapi.sga.model.aluno.Aluno;

public class Atualiza {
    public void atualizarAluno(AlunoController alunoController, Scanner scanner, Aluno aluno) {
        int opcao;
        int codigo;
        int defCodigo = 0;
        
        do{
        System.out.println("");
        System.out.println("Digite 1 para atualizar um aluno ou 0 para voltar.");
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                System.out.println("");
                System.out.println("ATUALIZAÇÃO DE ALUNO.");
                do {
                    System.out.print("Digite o código do aluno que deseja alterar: ");
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
                    System.out.println("");
                    System.out.println("ALTERAÇÃO DAS INFORMAÇÕESES DO ALUNO DE CÓDIGO: "+codigo);
                    System.out.print("Digite o novo nome do aluno: ");
                    aluno.setNome(scanner.nextLine());
                    System.out.print("Digite o novo CPF do aluno : ");
                    cpf.setCPF(scanner.nextLine());
                    
                    //verificar os outros campos do cadastro de aluno >> Ronei
                    
                    alunoController.cadastrarAluno(aluno);

                    System.out.println("");                       
                    System.out.println("----------------------------------");
                    System.out.println("ATUALIZAÇÃO REALIZADA COM SUCESSO.");
                    System.out.println("----------------------------------");
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
                System.out.println("Opção Inválida.");
                System.out.println("");
                break;
            }
        }while (opcao != 0 && opcao != 1);
    }
    
}
