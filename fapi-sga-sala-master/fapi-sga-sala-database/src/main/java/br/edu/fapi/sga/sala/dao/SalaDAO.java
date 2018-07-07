package br.edu.fapi.sga.sala.dao;

import br.edu.fapi.sga.model.sala.Sala;

import java.util.ArrayList;
import java.util.List;

public class SalaDAO {
    public boolean cadastrarSala(Sala sala) {
        return true;
    }

    public boolean atualizar(Sala sala) {
        return true;

    }

    public List<Sala> listarSala() {

        List<Sala> list = new ArrayList<>();

        for (int i = 0; i < 10;i++){
            Sala sala = new Sala();
            sala.setNome("Teste");
            sala.setNumero(String.valueOf(i));
            list.add(sala);
        }
        return list;
    }

    public Sala pesquisarSala(String sala) {
        Sala salaRetorno = new Sala();
        salaRetorno.setNome("Teste");
        salaRetorno.setNumero("1");
        return salaRetorno;
    }

    public boolean excluirSala(int idSala) {
        return true;

    }
}
