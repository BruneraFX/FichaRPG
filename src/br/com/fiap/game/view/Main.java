package br.com.fiap.game.view;

import br.com.fiap.game.model.PersonagemMagico;

public class Main {
    public static void main(String[] args) {

        PersonagemMagico mago = new PersonagemMagico("Gandalf", 100, "magia");

        //mago.nome = "Gandalf";
       // mago.nivelEnergia = 100;
       // mago.poderMagico = "Magia";

        System.out.println("nome:" + mago.getNome() + " Energia:" + mago.getNivelEnergia() + " Poder:" + mago.getPoderMagico());

        PersonagemMagico elfo = new PersonagemMagico("legolas", 50, "Arqueiro");

        // mago.nome = "Legolas";
        //mago.nivelEnergia = 50;
        //mago.poderMagico = "Arqueiro";

        System.out.println("nome:" + mago.getNome() + " Energia:" + mago.getNivelEnergia() + " Poder:" + mago.getPoderMagico());
    }
}

