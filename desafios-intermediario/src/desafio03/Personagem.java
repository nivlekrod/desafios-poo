package desafio03;

abstract class Personagem {
    private String nome;
    private int vida;
    private int mana;
    private float xp;
    private int inteligencia;
    private int forca;
    private int level;

    private static int qtdDePersonagens = 0;

    public Personagem() {
    }

    public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.xp = xp;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.level = level;

        qtdDePersonagens++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public static int getQtdDePersonagens() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Quantidade de personagens criados: " + qtdDePersonagens);
        return qtdDePersonagens;
    }

    public static void setQtdDePersonagens(int qtdDePersonagens) {
        Personagem.qtdDePersonagens = qtdDePersonagens;
    }

    public abstract void lvlUp();

    public abstract int attack();

    public abstract void exibirDetalhes();
}
