package desafio02.br.com.gft.model;

import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    List<Livro> livros;
    List<VideoGame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public double calculaPatrimonio() {
        double total = 0;
        if (livros != null) {
            for (Livro livro : livros) {
                total += livro.getPreco() * livro.getQtd();
            }
        }
        if (videoGames != null) {
            for (VideoGame videoGame : videoGames) {
                total += videoGame.getPreco() * videoGame.getQtd();
            }
        }

        System.out.printf("O patrimônio total da loja é: R$ %.2f%n", total);

        return total;
    }

    public void listaLivros() {
        System.out.println("_________________________________________________");
        System.out.println("A loja " + getNome() + " possui estes livros para venda:");
        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                System.out.println("Livro :");
                livro.exibirInfo();

                System.out.println("_________________________________________________");
            }
        } else {
            System.out.println("A loja não tem livros no seu estoque.");
        }
    }

    public void listaVideoGames() {
        System.out.println("_________________________________________________");
        System.out.println("A loja " + getNome() + " possui estes video-games para venda:");
        if (!videoGames.isEmpty()) {
            for (VideoGame videoGame : videoGames) {
                System.out.println("Video-Game :");
                videoGame.exibirInfo();

                System.out.println("_________________________________________________");
            }
        } else {
            System.out.println("A loja não tem video-games no seu estoque.");
        }
    }
}
