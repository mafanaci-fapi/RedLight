package br.edu.fapi.sga.sala.controller;

import br.edu.fapi.sga.model.sala.Sala;
import java.util.List;

public interface SalaController {

 public void cadastrarSala(Sala sala);
 public void atualizar(Sala sala);
 public List<Sala> listarSala();
 public Sala pesquisarSala(String sala);
 public void excluirSala(int idSala);
  
}
