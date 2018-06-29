package br.edu.fapi.sga.turma.view.menu;

import java.util.Scanner;

import br.edu.fapi.sga.model.turma.Turma;
import br.edu.fapi.sga.turma.controller.TurmaController;

public class MenuTurma {

	public void menu(TurmaController turmaController) {
		int opcao = -1;
		while (opcao != 0) {
			System.out.println("1 - Cadastrar sala.");
			System.out.println("2 - Atualizar sala.");
			System.out.println("3 - Listar sala.");
			System.out.println("4 - Pesquisar sala.");
			System.out.println("5 - Excluir sala.");
			Scanner scanner = new Scanner(System.in);
			opcao = scanner.nextInt();
			
		}
		
					
		Turma turma = new Turma();
		
		switch(opcao) {
		case 1 :
			turmaController.cadrastarTurma(turma);
			
			break;
		case 2 :
			turmaController.atualizarTurma(turma);
			
			break;
		case 3:
			turmaController.listarTurma(turma);
			break;
		case 4 :
			turmaController.pesquisarTurma(turma);
			break;
		case 5:
			turmaController.excluirTurma(turma);
		break;
		
		default:
			System.out.println("Opção invalida.");
		
		}
	}
}