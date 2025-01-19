import desafio01.Carro;
import desafio02.br.com.gft.main.Principal;
import desafio03.Sistema;
import desafio04_05_06.SistemaDePessoas;
import desafio07.SistemaFuncionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                Menu:
                1. Executar Desafio 01
                2. Executar Desafio 02
                3. Executar Desafio 03
                4. Executar Desafio 04, 05, 06
                5. Executar Desafio 07
                6. Sair
            """);

            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1 -> {
                    System.out.println("Executando Desafio 01...");
                    Carro.main();
                }
                case 2 -> {
                    System.out.println("Executando Desafio 02...");
                    Principal.main();
                }
                case 3 -> {
                    System.out.println("Executando Desafio 03...");
                    Sistema.main();
                }
                case 4 -> {
                    System.out.println("Executando Desafio 04, 05, 06...");
                    SistemaDePessoas.main();
                }
                case 5 -> {
                    System.out.println("Executando Desafio 07...");
                    SistemaFuncionario.main();
                }
                case 6 -> {
                    System.out.println("Encerrando programa!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
