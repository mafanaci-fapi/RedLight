package br.edu.fapi.sga.turma.controller.impl;

import java.util.List;

import br.edu.fapi.sga.model.turma.Turma;
import br.edu.fapi.sga.turma.business.impl.TurmaBusinessImpl;
import br.edu.fapi.sga.turma.controller.TurmaController;

public class TurmaControllerImpl implements TurmaController {

	private TurmaBusinessImpl turmaBusiness;

	public TurmaControllerImpl() {
		this.turmaBusiness = new TurmaBusinessImpl();
	}

	public void setAvisoBusiness(TurmaBusinessImpl turmaBusiness) {
		this.turmaBusiness = turmaBusiness;
	}

	public int cadastrarTurma(Turma turma) {
		return turmaBusiness.cadastrarTurma(turma);
	}

	@Override
	public Turma pesquisarTurma(Turma turma) {
		return turmaBusiness.pesquisarTurma(turma);
	}

	@Override
	public List<Turma> pesquisarListaTurma(Turma turma) {
		return turmaBusiness.pesquisarListarTurma(turma);
	}

	@Override
	public int atualizarTurma(Turma turma) {
		return turmaBusiness.atualizarTurma(turma);
	}

	@Override
	public int excluirTurma(Turma turma) {
		return turmaBusiness.excluirTurma(turma);
	}
}