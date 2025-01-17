package desafio01;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String placa, String cor, float km, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.preco = preco;
        this.isLigado = false;
        this.velocidade = 0;
        this.litrosCombustivel = 0;
    }

    public Veiculo(String marca, String modelo, String placa, String cor, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = 0.0F;
        this.preco = preco;
        this.isLigado = false;
        this.velocidade = 0;
        this.litrosCombustivel = 20;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void acelerar() {
        if (isLigado) {
            velocidade += 20;
            System.out.println("A velocidade do veículo aumentou 20km/h. Velocidade atual: " + velocidade + "km/h");
        } else {
            System.out.println("O carro não está ligado");
        }
    }

    public void abastecer(int combustivel) {
        if (litrosCombustivel + combustivel > 60) {
            litrosCombustivel = 60;
            System.out.println("Não é possivel abastecer além do limite de 60 litros.");
        } else {
            litrosCombustivel += combustivel;
            System.out.println("O veículo foi abastecido. Quantidade de combustível atual: " + litrosCombustivel + " litros");
        }
    }

    public void frear() {
        if (velocidade == 0) {
            System.out.println("O veículo está parado. Não é possível frear");
        } else if (velocidade < 20) {
            velocidade = 0;
            System.out.println("O veículo parou");
        } else {
            velocidade -= 20;
            System.out.println("O veículo está freiando. Velocidade atual: " + velocidade + " km/h");
        }

    }

    public void pintar(String cor) {
        this.cor = cor;
        System.out.println("A pintura do veículo foi alterada. Cor atual: " + cor);
    }

    public void ligar() {
        if (!isLigado) {
            if (litrosCombustivel > 0) {
                isLigado = true;
                System.out.println("O veículo foi ligado.");
            } else {
                System.out.println("Não é possível ligar o veículo sem combustível");
            }
        } else {
            System.out.println("O veículo já está ligado");
        }
    }

    public void desligar() {
        if (!isLigado) {
            System.out.println("O veículo já está desligado");
        } else if (velocidade > 0) {
            System.out.println("O veículo está em movimento, não pode ser desligado");
        } else {
            isLigado = false;
            System.out.println("O veículo foi desligado");
        }
    }

    public String showInfo() {
        return "Veículo\n" +
                "Marca: " + marca +
                ", Modelo: " + modelo +
                ",\nPlaca: " + placa +
                ", Cor: " + cor +
                ",\nQuilometragem: " + km +
                ", Estado: " + (isLigado ? "Ligado" : "Desligado") +
                ",\nCombustível: " + litrosCombustivel + " litros" +
                ", Preço: R$" + preco;
    }

}
