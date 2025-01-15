package br.com.fiap.game.model;

public class PersonagemMagico {

    //Atributos
    private String nome;
    private int nivelEnergia;
    private String poderMagico;
    private HabilidadeEspecial habilidade;

    public PersonagemMagico(String nome , int nivelEnergia, String poderMagico){
        this.nome = nome;
        this.nivelEnergia = nivelEnergia;
        this.poderMagico = poderMagico;
    }

    public PersonagemMagico() {

    }

    public void atacar(String ataque){
        if (nivelEnergia >= 10){
            System.out.println(nome + " Realizou um ataque: " + ataque + "!");
            nivelEnergia -= 10;
        }else{
            System.out.println(nome + " Está sem mana para atacar.");
        }
    }
    public int aumentarEnergia (int energia){
        nivelEnergia = nivelEnergia + energia;
        return nivelEnergia;
    }
    public void ativarHabilidadeEspecial(){
        if (!habilidade.isHabilitada()){
            System.out.println("Hablidade especial não está habilitada.");
        }else if (nivelEnergia >= habilidade.getCustoEnergia()){
            System.out.println(nome + " está ativando  a habilidade:" + habilidade.getNome());
        }else {
            System.out.println(nome + " está sem mana para utilizar a habilidade especial.");
        }
    }
    public void exibirDetalhes(){
        System.out.println("nome: " + nome + " Nível de energia: " + nivelEnergia + " Poder Mágico: " + poderMagico);
    }

    public String getNome() {
        return nome;
    }

    public PersonagemMagico setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public PersonagemMagico setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
        return this;
    }

    public String getPoderMagico() {
        return poderMagico;
    }

    public PersonagemMagico setPoderMagico(String poderMagico) {
        this.poderMagico = poderMagico;
        return this;
    }

    public HabilidadeEspecial getHabilidade() {
        return habilidade;
    }

    public PersonagemMagico setHabilidade(HabilidadeEspecial habilidade) {
        this.habilidade = habilidade;
        return this;
    }
}
