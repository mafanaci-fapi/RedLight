package br.edu.fapi.sga.turma.view;

import java.util.Scanner;
import br.edu.fapi.sga.turma.view.funcionario.Coordenador;
import br.edu.fapi.sga.turma.view.funcionario.DiretorAcademico;
import br.edu.fapi.sga.turma.view.funcionario.Secretaria;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\nDigite seu cargo:");
			System.out.println("\n1 - Coordenador");
			System.out.println("2 - Secretaria");
			System.out.println("3 - Diretor AcadÃªmico");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				Coordenador coordenador = new Coordenador();
				coordenador.manterTurma();
				break;
			case 2:
				Secretaria secretaria = new Secretaria();
				secretaria.manterTurma();
				break;
			case 3:
				DiretorAcademico diretorAcademico = new DiretorAcademico();
				diretorAcademico.manterTurma();
				break;
			default:
				System.out.println("Opção Invalida.");
				break;
			}
		} while (opcao < 1 || opcao > 3);
	}
}
