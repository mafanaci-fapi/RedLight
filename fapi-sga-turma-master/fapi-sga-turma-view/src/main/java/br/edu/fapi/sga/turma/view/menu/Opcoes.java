package br.edu.fapi.sga.turma.view.menu;

import java.util.Scanner;

import br.edu.fapi.sga.model.turma.Turma;
import br.edu.fapi.sga.turma.controller.TurmaController;
import br.edu.fapi.sga.turma.controller.impl.TurmaControllerImpl;

public class Opcoes {

	public void opcoes() {
        TurmaController turmaController = new TurmaControllerImpl();

		int opcao;
        int voltar = 1;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Turma turma = new Turma();

		do {
			System.out.println("\nQual das seguites opções você deseja executar?");
			System.out.println("\n1 - Cadastrar sala.");
			System.out.println("2 - Atualizar sala.");
			System.out.println("3 - Listar sala.");
			System.out.println("4 - Pesquisar sala.");
			System.out.println("5 - Excluir sala.");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				turmaController.cadastrarTurma(turma);

				break;
			case 2:
				turmaController.atualizarTurma(turma);

				break;
			case 3:
				turmaController.pesquisarListaTurma(turma);
				break;
			case 4:
				turmaController.pesquisarTurma(turma);
				break;
			case 5:
				turmaController.excluirTurma(turma);
				break;

			default:
				System.out.println("Opção invalida.");
			}
		} while (voltar != 0);
	}
}