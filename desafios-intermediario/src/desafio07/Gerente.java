package desafio07;

public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double bonificacao() {
        return super.bonificacao() + 10000.00;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Gerente ");
        super.exibirDetalhes();
    }
}
