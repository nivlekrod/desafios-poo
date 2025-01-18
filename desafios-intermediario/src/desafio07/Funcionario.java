package desafio07;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double bonificacao() {
        return salario;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Base: " + salario);
        System.out.println("Salário com Bonificação: " + bonificacao());
        System.out.println("----------------------------------------------------------");

    }
}
