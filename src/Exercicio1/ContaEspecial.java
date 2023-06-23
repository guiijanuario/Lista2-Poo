package Exercicio1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class ContaEspecial extends ContaBancaria{

    DecimalFormat formata = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    private double limite;

    public ContaEspecial(String nomeCliente, String numConta, double limite) {
        super(nomeCliente, numConta);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


    public double depositar(String numconta, double deposito) {
        List<ContaEspecial> listaContaEspecial = Teste.DB_CONTASESPECIAIS;

        double newSaldo = 0;
        for (ContaEspecial contaEsp : listaContaEspecial) {
            if (contaEsp.getNumConta().equalsIgnoreCase(numconta)) {
                newSaldo = contaEsp.getSaldo() + deposito + contaEsp.getLimite();
                contaEsp.setSaldo(newSaldo);
                System.out.println("\n\n[ ------- Deposito efetuado com sucesso!   ------- ]\n[ ------- Seu saldo agora é de: " + formata.format(contaEsp.getSaldo()) + "  ------- ]\n");
                return newSaldo;
            }
        }
        return newSaldo;
    }

    public ContaEspecial cadastrarContaEspecial(String nomeCliente, String numConta, double limite){
        List<ContaEspecial> listaContaEspecial = Teste.DB_CONTASESPECIAIS;

        listaContaEspecial.add(new ContaEspecial(nomeCliente,numConta,limite));
        System.out.println("\n\n[ ------------------------------------------------------ ]");
        System.out.println("[ ------- Conta Especial cadastrada com sucesso! ------- ]");
        System.out.println("[ ------- Limite especial " + formata.format(this.getLimite()) + " ------- ]");
        System.out.println("[ ------------------------------------------------------ ]");

        return ContaEspecial.this;
    }
    @Override
    public String toString() {

        return  "\n" +"Nome do Favorecido:" + this.getNomeCliente() + "\n" +
                "Número da conta: " + this.getNumConta() + "\n" +
                "Limite especial: " + this.getLimite() + "\n" +
                "Saldo atual da conta: " + formata.format(this.getSaldo());
    }
}


