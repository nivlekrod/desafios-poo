package desafio07;

public class Vendedor extends Funcionario {
    public Vendedor() {
    }

    public Vendedor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double bonificacao() {
        return super.bonificacao() + 3000.00;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Vendedor ");
        super.exibirDetalhes();
    }
}
