package br.com.fiap.game.view;
import br.com.fiap.game.model.Item;
import java.util.Scanner;

public class ViewItem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Item item = null;
        int opcao;

        do{
            System.out.println("Escolha uma opção: \n1-Cadastrar Item \n2-Exibir Item \n0-Sair ");
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite o nome do item: ");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite a descrição do item");
                    String descricao = sc.next() + sc.nextLine();
                    System.out.println("O item é raro?");
                    boolean raro = sc.nextBoolean();
                    System.out.println("Digite o nível de poder do item");
                    int nivelPoder = sc.nextInt();
                    item = new Item(nome, descricao, raro, nivelPoder);
                    break;
                case 2:
                    if(item != null){
                        System.out.println("nome " + item.getNome() + "Descrição" + item.getDescricao() + "Raridade" + item.isRaro() + "Nivel de poder" + item.getNivelPoder());
                    }else {
                        System.out.println("Nenhum item cadastrado ainda!");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando o programa!");
                    break;
                default:
                    System.out.println("Opção Inválida !");

                    }
            }while(opcao != 0);
            sc.close();
        }
}
