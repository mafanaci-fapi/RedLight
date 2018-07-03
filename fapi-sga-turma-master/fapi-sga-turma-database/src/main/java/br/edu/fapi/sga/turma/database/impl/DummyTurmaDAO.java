package br.edu.fapi.sga.turma.database.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.fapi.sga.model.turma.Turma;
import br.edu.fapi.sga.turma.database.TurmaDAO;

public class DummyTurmaDAO implements TurmaDAO {

	@Override
	public int cadrastarTurma(Turma turma) {
		System.out.println("Data Layer -> Aviso cadastrado com sucesso");
		return 1;
	}

	@Override
	public Turma pesquisarTurma(Turma turma) {
		System.out.println("Data Layer -> Turma pesquisada com sucesso");
		Turma turmaResultado = new Turma();
		turmaResultado.setCodigo(1);
		turmaResultado.getDescricao();
		return turmaResultado;
	}

	public List<Turma> listarTurma(Turma turma) {
		System.out.println("Data Layer -> Turmas pesquisadas com sucesso");

		Turma turmaResultado1 = new Turma();
		turmaResultado1.setCodigo(1);
		turmaResultado1.setDescricao("Teste Descrição");

		Turma turmaResultado2 = new Turma();
		turmaResultado2.setCodigo(1);
		turmaResultado2.setDescricao("Teste Descrição");

		ArrayList<Turma> listaTurma = new ArrayList<>();
		listaTurma.add(turmaResultado1);
		listaTurma.add(turmaResultado2);

		return listaTurma;
	}

	@Override
	public int atualizarTurma(Turma turma) {
		System.out.println("Data Layer -> Aviso atualizado com sucesso");
		return 1;

	}

	@Override
	public int excluirTurma(Turma turma) {
		System.out.println("Data Layer -> Aviso apagado com sucesso");
		return 1;
	}
}
