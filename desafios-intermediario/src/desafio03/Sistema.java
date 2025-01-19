package desafio03;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    public static void main() {
        List<String> magiasElementais = new ArrayList<>();
        magiasElementais.add("Bola de Fogo");
        magiasElementais.add("Raio do Trovão");

        List<String> magiasComuns = new ArrayList<>();
        magiasComuns.add("Envenenar");
        magiasComuns.add("Soneca");

        Mago mago1 = new Mago("Kelvin", 300, 250, 100f, 250, 150, 1, magiasElementais);
        Mago mago2 = new Mago("Allana", 300, 250, 100f, 250, 150, 1, magiasComuns);

        mago1.exibirDetalhes();
        mago2.exibirDetalhes();

        List<String> habilidadesCorporais = new ArrayList<>();
        habilidadesCorporais.add("Espada");
        habilidadesCorporais.add("Escudo");

        Guerreiro guerreiro1 = new Guerreiro("Gabriel", 300, 150, 100f, 150, 300, 1, habilidadesCorporais);

        guerreiro1.exibirDetalhes();

        mago1.attack();
        mago1.lvlUp();
        mago1.aprenderMagia("Geada");
        mago1.exibirDetalhes();


        guerreiro1.attack();
        guerreiro1.lvlUp();
        guerreiro1.aprenderHabilidade("Artes Marciais");
        guerreiro1.exibirDetalhes();

        Personagem.getQtdDePersonagens();
    }
}
