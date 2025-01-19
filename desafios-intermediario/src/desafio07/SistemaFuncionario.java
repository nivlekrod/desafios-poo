package desafio07;

public class SistemaFuncionario {
    public static void main() {
        Gerente gerente = new Gerente("Thiago", 26, 3500.0);
        Supervisor supervisor = new Supervisor("Kelvin", 22, 2000.0);
        Vendedor vendedor = new Vendedor("Gabriel", 20, 1600.0);


        gerente.exibirDetalhes();
        supervisor.exibirDetalhes();
        vendedor.exibirDetalhes();
    }
}
