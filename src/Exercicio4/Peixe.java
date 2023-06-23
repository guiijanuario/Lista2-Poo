package Exercicio4;

public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
        this.setNumPatas(0);
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Nome:" + this.getNome()  + "\n" +
                "Comprimento:" + this.getComprimento() + "\n" +
                "Números de Patas: " + this.getNumPatas() + "\n" +
                "Cores: " + this.getCor() + "\n" +
                "Ambiente: " + this.getAmbiente() + "\n" +
                "Características: " + this.getCaracteristicas() + "\n" +
                "Velocidade" + this.getVelocidade();
    }
}
