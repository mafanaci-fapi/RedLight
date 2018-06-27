package br.edu.fapi.sga.aluno.view;

import java.util.Scanner;

import br.edu.fapi.sga.aluno.view.funcionario.Secretaria;
import br.edu.fapi.sga.aluno.view.funcionario.DiretorAcademico;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("Digite seu cargo:");
			System.out.println("1 - Secretaria");
			System.out.println("2 - Diretor Acadêmico");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				Secretaria secretaria = new Secretaria();
				secretaria.manterAluno();
				break;
			case 2:
				DiretorAcademico diretorAcademico = new DiretorAcademico();
				diretorAcademico.manterAluno();
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		} while (opcao < 1 || opcao > 3);
	}
}
