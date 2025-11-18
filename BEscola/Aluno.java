package BEscola;

public class Aluno {
    public String nome;
    private int idade;
    protected String matricula;

    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public void exibirDados(){
        System.out.println(
            "Nome: " + nome + "\n" +
            "Matricula: " + matricula  + "\n" +
            "Idade: " + idade 
        );
        validarIdade();
    }

    private void validarIdade(){
        if (idade > 0) {
            System.out.println("Idade válida.");
        } else {
            System.out.println("Idade inválida.");
        }
    }
}
