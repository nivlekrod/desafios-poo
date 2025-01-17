package desafio03;

import java.lang.invoke.StringConcatFactory;
import java.util.List;

public class Mago extends Personagem {
    private List<String> magia;

    private static int qtdPersonagem;

    public Mago() {
    }

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.magia = magia;
        Mago.qtdPersonagem++;
    }

    public List<String> getMagia() {
        return magia;
    }

    public void setMagia(List<String> magia) {
        this.magia = magia;
    }

    public void aprenderMagia(String magias) {
        magia.add(magias);
        System.out.println("Mago " + getNome() + " aprendeu " + magias);
    }

    public int attack() {
        int numeroRandomico = (int) (Math.random() * 301);
        int danoAtaque = (getInteligencia() * getLevel()) + numeroRandomico;
        System.out.println("Mago " + getNome() + " causou " + danoAtaque + " de Dano de Ataque");
        return danoAtaque;
    }

    @Override
    public void lvlUp() {
        setLevel(getLevel() + 1);

        setMana(getLevel() * 5);
        setInteligencia(getLevel() * 5);
        setVida(getLevel() * 5);
        setForca(getLevel() * 3);
        setXp(getLevel() * 1.5f);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Mago: " + getNome());
        System.out.println("Vida: " + getVida() + ", Mana: " + getMana());
        System.out.println("Experiência: " + getXp() + ", Level: " + getLevel());
        System.out.println("Magias: " + String.join(", ", magia));
        System.out.println("----------------------------------------------------------");
    }
}
