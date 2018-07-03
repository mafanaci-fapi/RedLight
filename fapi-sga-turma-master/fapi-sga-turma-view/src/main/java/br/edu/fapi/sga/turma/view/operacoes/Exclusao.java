package br.edu.fapi.sga.turma.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.turma.Turma;
import br.edu.fapi.sga.turma.controller.TurmaController;

public class Exclusao {
	public void excluirAviso(TurmaController turmaController, Scanner scanner, Turma turma) {
		int opcao;
		int codigo;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para excluir uma turma ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("");
				System.out.println("EXCLUSÃO DE TURMAS.");
				do {
					System.out.print("Digite o codigo da turma que deseja excluir: ");
					codigo = scanner.nextInt();
					scanner.nextLine();
					if (codigo < 0) {
						System.out.println("O código digitado não pode ser menor que 0. Por favor digite novamente.");
						System.out.println("");
					} else {
						defCodigo = 1;
					}
				} while (defCodigo == 0);
				if (codigo == turma.getCodigo()) {
					turma.setCodigo(-1);

					turmaController.excluirTurma(turma);

					System.out.println("");
					System.out.println("---------------------------");
					System.out.println("TURMA EXCLUIDA COM SUCESSO.");
					System.out.println("---------------------------");
					System.out.println("");
				} else {
					System.out.println("");
					System.out.println("Aviso nÃ£o encontrado");
					System.out.println("");
				}
				break;
			case 0:
				System.out.println("");
				break;
			default:
				System.out.println("Opção Invalida");
				System.out.println("");
				break;
			}
		} while (opcao != 0 && opcao != 1);
	}
}
