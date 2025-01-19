package desafio01;

import java.util.Scanner;

public class Carro {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        Veiculo veiculo = new Veiculo("Honda", "Civic", "SKS1A24", "Azul", 25000, 135000);

        while (true) {
            System.out.println("""
                    Menu de Opções:
                    1. Exibir Estado do Veículo
                    2. Abastecer
                    3. Ligar
                    4. Acelerar
                    5. Frear
                    6. Alterar Cor
                    7. Desligar
                    8. Sair
                    """);

            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println(veiculo.showInfo());
                    System.out.println("___________________________________");
                }
                case 2 -> {
                    System.out.print("Informe a quantidade de combustível: ");
                    int combustivel = sc.nextInt();
                    veiculo.abastecer(combustivel);
                    System.out.println("___________________________________");
                }
                case 3 -> {
                    veiculo.ligar();
                    System.out.println("___________________________________");
                }
                case 4 -> {
                    veiculo.acelerar();
                    System.out.println("___________________________________");

                }
                case 5 -> {
                    veiculo.frear();
                    System.out.println("___________________________________");
                }
                case 6 -> {
                    System.out.print("Informe a nova cor: ");
                    String cor = sc.nextLine();
                    veiculo.setCor(cor);
                    System.out.println("___________________________________");

                }
                case 7 -> {
                    veiculo.desligar();
                    System.out.println("___________________________________");
                }
                case 8 -> {
                    System.out.println("Encerrando o programa...");
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}
