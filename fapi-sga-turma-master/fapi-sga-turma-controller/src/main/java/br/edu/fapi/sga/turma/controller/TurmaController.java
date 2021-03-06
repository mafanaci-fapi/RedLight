package br.edu.fapi.sga.turma.controller;

import java.util.List;

import br.edu.fapi.sga.model.turma.Turma;

public interface TurmaController {
	
	int cadastrarTurma(Turma turma);

	Turma pesquisarTurma(Turma turma);
	
	List<Turma> pesquisarListaTurma(Turma turma);
	
	int atualizarTurma(Turma turma);
	
	int excluirTurma(Turma turma);

}
