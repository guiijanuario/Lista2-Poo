package Exercicio4;

public class Mamifero extends Animal{

    private String alimento;

    public Mamifero(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }



    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "\nNome:" + this.getNome()  + "\n" +
                "Comprimento:" + this.getComprimento() + "\n" +
                "Números de Patas: " + this.getNumPatas() + "\n" +
                "Cores:" + this.getCor() + "\n" +
                "Ambiente: " + this.getAmbiente() + "\n" +
                "Alimento: " + this.getAlimento() + "\n" +
                "Velocidade" + this.getVelocidade() + "\n";
    }
}
