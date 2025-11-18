package ALoja;

import java.util.Scanner;

public class Produto {
    Scanner leia = new Scanner(System.in);

    public String nome;
    private double preco;
    protected int quantidade; // quantidade total
    private int unidades; // unidades vendidas
    
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Sets e Gets
        
    public int getUnid(){
        return unidades;
    }
    public void setUnid(int unidades){
        this.unidades = unidades;
    }

    public void venderProduto(int unidades) {
        boolean reptirVenda = false;
        String novaVenda;
        setUnid(unidades);
        
        do {
            System.out.println("\nQuantas unidades deseja retirar do estoque?");
            unidades = leia.nextInt();
            leia.nextLine();
            
            if (unidades <= quantidade) {
                quantidade -= unidades;
                System.out.println(
                    "Quatidade atualizada em estoque: " + quantidade + "\n" +
                    "Quantidade retirada: " + unidades
                );
            } else {
                System.out.println(
                    "Recursos insusficientes\n" +
                    "Numero inserido de unidades vendidas: " + unidades + "\n" +
                    "Quantidade total em estoque: " + quantidade + "\n" +
                    "Tente de novo\n\n"
                );
            }

            System.out.println("Deseja realizar uma nova venda? (S/N)");
            novaVenda = leia.nextLine();
            
            if (novaVenda.equalsIgnoreCase("N")) {
                reptirVenda = true;
                System.out.println("Programa encerrado");
            } else {
                System.out.println("Repetição do programa...\n\n\n");
                this.exibirInfo();
            }
        } while (!reptirVenda);       
    }

    public void exibirInfo() {
        // imprime o nome e a quantidade em estoque diretamente
        System.out.println(
            "[---ESTOQUE---]\n" +
            "Produto: " + nome + "\n" +
            "Preço: " + preco + "\n" +
            "Total: " + quantidade
        );
    }
}