package desafio07;

public class Supervisor extends Funcionario {
    public Supervisor() {
    }

    public Supervisor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double bonificacao() {
        return super.bonificacao() + 5000.00;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Supervisor ");
        super.exibirDetalhes();
    }
}
