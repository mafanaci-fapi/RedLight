package br.edu.fapi.sga.sala.controller;

import br.edu.fapi.sga.model.sala.Sala;
import br.edu.fapi.sga.sala.business.SalaBusiness;
import br.edu.fapi.sga.sala.dao.SalaDAO;

import java.util.List;

public class SalaControllerImp implements SalaController {

    SalaDAO salaDAO = new SalaDAO();
    SalaBusiness salaBusiness = new SalaBusiness();

    @Override
    public void cadastrarSala(Sala sala) {
        if(salaBusiness.validaSala(sala)) {
            salaDAO.cadastrarSala(sala);
        }
    }

    @Override
    public void atualizar(Sala sala) {
        if(salaBusiness.validaSala(sala)){
            salaDAO.atualizar(sala);
        }
    }

    @Override
    public List<Sala> listarSala() {

        return salaDAO.listarSala();
    }

    @Override
    public Sala pesquisarSala(String sala) {
        return salaDAO.pesquisarSala(sala);
    }

    @Override
    public void excluirSala(int idSala) {
        salaDAO.excluirSala(idSala);
    }
}
