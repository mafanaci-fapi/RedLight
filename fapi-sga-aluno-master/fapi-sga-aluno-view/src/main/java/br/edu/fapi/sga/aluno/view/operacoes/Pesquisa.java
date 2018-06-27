package br.edu.fapi.sga.aluno.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.aluno.controller.AlunoController;
import br.edu.fapi.sga.model.aluno.Aluno;

public class Pesquisa {
    public void pesquisarAluno(AlunoController alunoController, Scanner scanner, Aluno aluno) {
        int opcao;
        int defCodigo = 0;
        int codigo;
        
        do{
        System.out.println("");
        System.out.println("Digite 1 para pesquisar um aluno ou 0 para voltar.");
        opcao = scanner.nextInt();
        scanner.nextLine();
                
        switch (opcao) {
            case 1:
                do{
                    System.out.println("");
                    System.out.print("Digite o código do aluno que deseja pesquisar: ");
                    codigo = scanner.nextInt();
                    scanner.nextLine();
                    if (codigo < 0){
                        System.out.println("O código pesquisado nãoo pode ser menor que 0. Por favor digite novamente.");
                        System.out.println("");
                    }else{
                        defCodigo = 1;
                    }
                }while (defCodigo == 0);
                if (codigo == aluno.getCodigo()){
                    alunoController.pesquisarAluno(aluno);

                    System.out.println("");
                    System.out.println("Código: "+aluno.getCodigo());
                    System.out.println("Nome: "+aluno.getNome());
                    System.out.println("CPF: "+aluno.getCpf());
                    System.out.println("Rg: "+aluno.getRg());
                    System.out.println("Telefone: "+aluno.getTelefone());
                    System.out.println("Email: "+aluno.getEmail());
                    System.out.println("Endereço: "+aluno.getEndereco());
                    System.out.println("Id: "+aluno.getId());
                    
                    System.out.println("");
                    
                    // Verificar os outros campos referentes ao cadastro de aluno
                }else{
                    System.out.println("");
                    System.out.println("Aluno não encontrado.");
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
