package br.edu.fapi.sga.turma.view;

import java.util.Scanner;

public class MenuTurma {

	public void menu() {
		int opcao = -1;
		while (opcao != 0) {
			System.out.println("1 - Cadastrar sala.");
			System.out.println("2 - Atualizar sala.");
			System.out.println("3 - Listar sala.");
			System.out.println("4 - Pesquisar sala.");
			System.out.println("5 - Excluir sala.");
			Scanner scanner = new Scanner(System.in);
			opcao = scanner.nextInt();
			// Sala sala = new Sala();
		}

		if (opcao == 1) {
			// sala.listarSala();
		} else if (opcao == 2) {
			// sala.atualizarSala();
		} else if (opcao == 3) {
			// sala.listarSala();
		} else if (opcao == 4) {
			// sala.pesquisarSala();
		} else if (opcao == 5) {
			// sala.excluirSala();
		} else {
			System.out.println("Opção inválida.");
		}
	}
}
