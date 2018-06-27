package br.edu.fapi.sga.turma.database;

import java.util.List;

import br.edu.fapi.sga.model.turma.Turma;

	public interface TurmaDataBase {
		
		int cadrastarTurma(Turma turma);

		Turma pesquisarTurma(Turma turma);
		
		List<Turma> listarTurma(Turma turma);
		
		int atualizarTurma(Turma turma);
		
		int excluirTurma(Turma turma);

	}