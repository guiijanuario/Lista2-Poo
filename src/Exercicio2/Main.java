package Exercicio2;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        System.out.println("Tributos da Conta Poupança: " + contaPoupanca.calcularTributos());

        ContaCorrente contaCorrente = new ContaCorrente(1000.0);
        System.out.println("Tributos da Conta Corrente: " + contaCorrente.calcularTributos());

        SeguroDeVida seguroDeVida = new SeguroDeVida();
        System.out.println("Tributos do Seguro de Vida: " + seguroDeVida.calcularTributos());
    }
}
