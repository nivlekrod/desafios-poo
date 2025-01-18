package desafio04_05_06;

import java.util.List;

public class Pessoa {
    private String nome;
    protected int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

    public static Pessoa getPessoaMaisVelha(List<Pessoa> pessoas) {
        if (pessoas.isEmpty()) {
            System.out.println("A lista está vazia.");
            return null;
        }

        Pessoa maisVelha = pessoas.get(0);
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() > maisVelha.getIdade()) {
                maisVelha = pessoa;
            }
        }

        System.out.println("A pessoa mais velha é: " + maisVelha.getNome() + " com " + maisVelha.getIdade() + " anos");
        return maisVelha;
    }

    public static void removerMenor(List<Pessoa> pessoas) {
        System.out.println("Lista antes da remoção: " + pessoas);

        pessoas.removeIf(pessoa -> pessoa.getIdade() < 18);

        System.out.println("Lista após a remoção: " + pessoas);
    }

    public static Pessoa consultar(List<Pessoa> pessoas, String nome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }

        System.out.println("Pessoa com nome " + nome + " não encontrada.");
        return null;
    }

    @Override
    public String toString() {
        return "Pessoa [" + "nome: " + nome + ", idade: " + idade + ']';
    }
}
