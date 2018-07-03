package br.edu.fapi.sga.turma.business.impl;

import java.util.List;

import br.edu.fapi.sga.model.turma.Turma;
import br.edu.fapi.sga.turma.business.TurmaBusiness;
import br.edu.fapi.sga.turma.database.TurmaDAO;
import br.edu.fapi.sga.turma.database.impl.DummyTurmaDAO;

public class TurmaBusinessImpl implements TurmaBusiness {

	private TurmaDAO turmaDAO;

	public TurmaBusinessImpl() {
		this.turmaDAO = new DummyTurmaDAO();
	}

	public void setTurmaDAO(TurmaDAO turmaDAO) {
		this.turmaDAO = turmaDAO;
	}

	public int cadastrarTurma(Turma turma) {

		if (turma != null) {
			return turmaDAO.cadrastarTurma(turma);
		} else {
			throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
		}
	}

	public Turma pesquisarTurma(Turma turma) {

		if (turma != null) {
			return turmaDAO.pesquisarTurma(turma);
		} else {
			throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
		}
	}

	public List<Turma> pesquisarListarTurma(Turma turma) {
		if (turma != null) {
			return turmaDAO.listarTurma(turma);
		} else {
			throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
		}
	}

	public int atualizarTurma(Turma turma) {
		if (turma != null) {
			return turmaDAO.atualizarTurma(turma);
		} else {
			throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
		}
	}

	public int excluirTurma(Turma turma) {
		if (turma != null) {
			return turmaDAO.excluirTurma(turma);
		} else {
			throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
		}
	}
}