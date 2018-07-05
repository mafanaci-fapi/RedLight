package br.edu.fapi.sga.sala.view;

import br.edu.fapi.sga.model.sala.Sala;
import br.edu.fapi.sga.sala.controller.SalaController;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuSala {

    Scanner scan = new Scanner(System.in);
    SalaController salaController;

    public void menu() {
        Sala sala = new Sala();

        System.out.println("1 - Cadastrar sala.");
        System.out.println("2 - Atualizar sala.");
        System.out.println("3 - Listar sala.");
        System.out.println("4 - Pesquisar sala.");
        System.out.println("5 - Excluir sala.");

        System.out.println("Escolha a opcao:");
        String escolha = scan.next();

        switch (escolha) {
            case "1":
                System.out.println("");

                System.out.println("Digite o nome da sala");
                sala.setNome(scan.next());
                System.out.println("Informe o numero da sala");
                sala.setNumero(scan.next());
                salaController.cadastrarSala(sala);
                break;
            case "2":
                System.out.println("Para atualiza a sala informe;");
                System.out.println("Nome da sala:");
                sala = salaController.pesquisarSala(scan.next());
                System.out.println("Informe os dados para atualizacao:");
                System.out.println("Digite o nome da sala");
                sala.setNome(scan.next());
                System.out.println("Informe o numero da sala");
                sala.setNumero(scan.next());
                salaController.atualizar(sala);                
                break;
            case "3":
                System.out.println("Salas:");
                List<Sala> listaSala = salaController.listarSala();
                 for (Sala iten : listaSala) {
                     System.out.println(iten.getNome() + " "+ iten.getNumero());
                }
                break;
            case "4":
                System.out.println("Nome da sala:");
                sala = salaController.pesquisarSala(scan.next());
                System.out.println(sala.getNome()+" "+sala.getNumero());
                break;
            case "5":
                System.out.println("Para excluir, informe o codigo da sala");
                salaController.excluirSala(scan.nextInt());
                System.out.println("Excluido com suscesso!!!!!!!!");
                break;

        }

    }

}
