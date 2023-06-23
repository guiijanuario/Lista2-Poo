package Exercicio2;

public class ContaPoupanca implements Tributavel{

    @Override
    public double calcularTributos() {
        //Como o tributo de poupança é 0, o retorno é 0.
        return 0;
    }
}
