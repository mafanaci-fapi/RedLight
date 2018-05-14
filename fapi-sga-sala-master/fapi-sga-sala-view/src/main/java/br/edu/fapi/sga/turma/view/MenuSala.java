package br.edu.fapi.sga.turma.view;

import java.util.Scanner;

public class MenuSala {

	public void menu() {
		int opcao = -1;
		while (opcao != 0) {
			System.out.println("1 - Cadastrar protocolo.");
			System.out.println("2 - Atualizar protocolo.");
			System.out.println("3 - Listar protocolo.");
			System.out.println("4 - Pesquisar protocolo.");
			System.out.println("5 - Excluir protocolo.");
			Scanner scanner = new Scanner(System.in);
			opcao = scanner.nextInt();
			// Protocolo protocolo = new Protocolo();

			if (opcao == 1) {
				// protocolo.listarProtocolo();
			} else if (opcao == 2) {
				// protocolo.atualizarProtocolo();
			} else if (opcao == 3) {
				// protocolo.listarProtocolo();
			} else if (opcao == 4) {
				// protocolo.pesquisarProtocolo();
			} else if (opcao == 5) {
				// protocolo.excluirProtocolo();
			} else {
				System.out.println("Opção inválida.");
			}
		}
	}
}
