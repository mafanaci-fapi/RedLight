package br.edu.fapi.sga.aluno.view.menu;

import br.edu.fapi.sga.aluno.controller.AlunoController;
import br.edu.fapi.sga.aluno.controller.impl.AlunoControllerImpl;
import br.edu.fapi.sga.aluno.view.operacoes.*;
import br.edu.fapi.sga.model.aluno.Aluno;

import java.util.Scanner;

public class Menu {
    public void menu() {
        AlunoController alunoController = new AlunoControllerImpl();

        int opcao;
        int voltar = 1;
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        do {
            System.out.println("Escolha uma opÁ„oo.");
            System.out.println("1 - Cadastrar aluno.");
            System.out.println("2 - Excluir aluno.");
            System.out.println("3 - Atualizar aluno.");
            System.out.println("4 - Pesquisar aluno.");
            System.out.println("5 - Listar alunos.");
            System.out.println("0 - Voltar");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Cadastro cadastro = new Cadastro();
                    cadastro.cadastrarAluno(alunoController, scanner, aluno);
                    break;
                case 2:
                    Exclusao exclusao = new Exclusao();
                    exclusao.excluirAluno(alunoController, scanner, aluno);
                    break;
                case 3:
                    Atualiza atualiza = new Atualiza();
                    atualiza.atualizarAluno(alunoController, scanner, aluno);
                    break;
                case 4:
                    Pesquisa pesquisa = new Pesquisa();
                    pesquisa.pesquisarAluno(alunoController, scanner, aluno);
                    break;
                case 5:
                    Listar listar = new Listar();
                    listar.listarAluno(alunoController, aluno);
                    break;
                case 0:
                    System.out.println("");
                    voltar = 0;
                    break;
                default:
                    System.out.println("Op√ß√£o inv√°lida.");
            }
        } while (voltar != 0);
    }
}
