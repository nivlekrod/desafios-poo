package desafio04_05_06;

import java.util.ArrayList;
import java.util.List;

public class SistemaDePessoas {
    public static void main() {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("João", 15));
        pessoas.add(new Pessoa("Leandro", 21));
        pessoas.add(new Pessoa("Paulo", 17));
        pessoas.add(new Pessoa("Jessica", 18));

        Pessoa maisVelha = Pessoa.getPessoaMaisVelha(pessoas);

        Pessoa.removerMenor(pessoas);

        Pessoa pessoaConsultada = Pessoa.consultar(pessoas, "Jessica");
        if (pessoaConsultada != null) {
            System.out.println("Pessoa encontrada. Nome: " + pessoaConsultada.getNome() + ", Idade: " + pessoaConsultada.getIdade());
        }
    }
}
