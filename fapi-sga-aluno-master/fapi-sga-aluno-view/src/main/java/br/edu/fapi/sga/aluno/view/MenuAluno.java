package br.edu.fapi.sga.aluno.view;

import java.util.Scanner;

public class MenuAluno {

	public void menu() {
		int opcao = -1;
		System.out.println();
		while (opcao != 0) {
			System.out.println("1 - Cadastrar aluno.");
			System.out.println("2 - Atualizar aluno.");
			System.out.println("3 - Listar aluno.");
			System.out.println("4 - Pesquisar aluno.");
			System.out.println("5 - Excluir aluno.");
			Scanner scanner = new Scanner(System.in);
			opcao = scanner.nextInt();
			// Aluno aluno = new Aluno();

			if (opcao == 1) {
				// aluno.listarAluno();
			} else if (opcao == 2) {
				// aluno.atualizarAluno();
			} else if (opcao == 3) {
				// aluno.listarAluno();
			} else if (opcao == 4) {
				// aluno.pesquisarAluno();
			} else if (opcao == 5) {
				// aluno.excluirAluno();
			} else {
				System.out.println("Opção inválida.");
			}
		}
	}

}
