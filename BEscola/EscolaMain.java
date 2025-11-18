package BEscola;

import java.util.Scanner;

public class EscolaMain {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Aluno aluno1 = new Aluno("Agatha", 38, "123456");
        Aluno aluno2 = new Aluno("Carmilla", 25, "654321");

        System.out.println("\n[----- DADOS DOS ALUNOS -----]");
        aluno1.exibirDados();
        System.out.println();
        aluno2.exibirDados();

        // Variavel nome possui acesso publico 
        System.out.println();
        System.out.println(aluno1.nome);
        
        // Variavel matricula possui acesso protegido
        System.out.println();
        System.out.println(aluno1.matricula);

        // tentativa de alterar e acessar variavel privada idade
        // aluno1.idade = 30;
        // System.out.println(aluno1.idade);
        // pela variavel ser privada, não funciona.
        
        // tentativa de chamada do método privado
        // aluno1.validarIdade();
        // pela variavel ser privada, não funciona.

    }
}
