package desafio03;

import java.util.List;

public class Guerreiro extends Personagem {
    private List<String> habilidade;

    public Guerreiro() {
    }

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidade) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.habilidade = habilidade;
    }

    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }

    public void aprenderHabilidade(String habilidades) {
        habilidade.add(habilidades);
        System.out.println("Guerreiro " + getNome() + " aprendeu " + habilidades);
    }

    @Override
    public void lvlUp() {
        setLevel(getLevel() + 1);

        setMana(getLevel() * 2);
        setInteligencia(getLevel() * 3);
        setVida(getLevel() * 5);
        setForca(getLevel() * 5);
        setXp(getLevel() * 1.5f);
    }

    @Override
    public int attack() {
        int numeroRandomico = (int) (Math.random() * 301);
        int danoAtaque = (getForca() * getLevel()) + numeroRandomico;
        System.out.println("Guerreiro " + getNome() + " causou " + danoAtaque + " de Dano de Ataque");
        return danoAtaque;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Guerreiro: " + getNome());
        System.out.println("Vida: " + getVida() + ", Mana: " + getMana());
        System.out.println("Experiência: " + getXp() + ", Level: " + getLevel());
        System.out.println("Habilidades: " + String.join(", ", habilidade));
        System.out.println("----------------------------------------------------------");
    }
}
