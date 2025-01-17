package desafio02.br.com.gft.model;

import desafio02.br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame() {
    }

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    @Override
    public double calculaImposto() {
        if (isUsado){
            System.out.printf("Imposto %s %s USADO R$%.2f%n", getNome(), getModelo(), getPreco() * 0.25);
            return getPreco() * 0.25;
        } else {
            System.out.printf("Imposto %s %s NOVO R$%.2f%n", getNome(), getModelo(), getPreco() *  0.45);
            return getPreco() *  0.45;
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Marca: " + getMarca() + ", Modelo: " + getModelo());
        System.out.println("Estado: " + (isUsado ? "Usado" : "Novo"));
        System.out.println("Preço: " + getPreco() + ", Quantidade: " + getQtd());
    }
}
