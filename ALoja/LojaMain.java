package ALoja;

import java.util.Scanner;
// Atividade do dia 07/10
public class LojaMain {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Produto produto1 = new Produto("Guaraná (Latinha)", 5.5, 100);
        
        produto1.exibirInfo();
        produto1.venderProduto(produto1.getUnid());
    }
}
