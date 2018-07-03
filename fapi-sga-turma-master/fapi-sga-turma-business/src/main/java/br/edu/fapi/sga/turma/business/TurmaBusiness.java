package br.edu.fapi.sga.turma.business;

import java.util.List;

import br.edu.fapi.sga.model.turma.Turma;

public interface TurmaBusiness{
		
		int cadastrarTurma(Turma turma);

		Turma pesquisarTurma(Turma turma);

	    List<Turma> pesquisarListarTurma(Turma turma);

	    int atualizarTurma(Turma turma);

	    int excluirTurma(Turma turma);

}
