package desafio02.br.com.gft.model;

import desafio02.br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
    private String autor;
    private String tema;
    private int qtdPag;

    public Livro() {
    }

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    @Override
    public double calculaImposto() {
        if (getTema().equalsIgnoreCase("educativo")) {
            return 0;
        } else {
            double imposto = 0.01;
            return getPreco() * imposto;
        }
    }

    public double calculaImposto(boolean printar) {
        double precoImposto = 0;
        if (getTema().equalsIgnoreCase("educativo")) {
            if (printar) {
                System.out.println("Livro Educativo não tem imposto: " + getNome());
            }
        } else {
            precoImposto = getPreco() * 0.1;
            if (printar) {
                System.out.println("Aplicado R$" + precoImposto + " no Livro " + getNome());
            }
        }

        return precoImposto;
    }


    public void exibirInfo() {
        System.out.println("Tema: " + getTema());
        System.out.println("Nome: " + getNome() + ", Autor: " + getAutor());
        System.out.println("Preço: " + getPreco() + ", Quantidade: " + getQtd());
    }
}
