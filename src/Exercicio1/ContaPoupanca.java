package Exercicio1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class ContaPoupanca extends ContaBancaria{

    DecimalFormat formata = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, String numConta, int diaRendimento) {
        super(nomeCliente, numConta);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        double saldo = this.getSaldo();
        double rendimentos = (saldo * taxaRendimento ) / 100;
        double newSaldo = saldo + rendimentos;
        this.setSaldo(newSaldo);
        System.out.println("Novo saldo após rendimento: " + newSaldo);
}

    public double depositar(String numconta, double deposito) {
        List<ContaPoupanca> listaContaPoupanca = Teste.DB_CONTASPOUPANCA;

        double newSaldo = 0;
        for (ContaPoupanca contaPoup : listaContaPoupanca) {
            if (contaPoup.getNumConta().equalsIgnoreCase(numconta)) {
                newSaldo = contaPoup.getSaldo() + deposito;
                contaPoup.setSaldo(newSaldo);
                System.out.println("\n[ ------------------------------------------------------ ]");
                System.out.println("[ ------- Deposito efetuado com sucesso!   ------- ]\n[ ------- Seu saldo agora é de: " + formata.format(contaPoup.getSaldo()) + "  ------- ]\n");
                System.out.println("[ ------------------------------------------------------ ]");
                return newSaldo;
            }
        }
        return newSaldo;
    }

    public double sacar(String numconta, double saque) {
        List<ContaPoupanca> listaContaPoupanca = Teste.DB_CONTASPOUPANCA;

        double newSaldo = 0;
        for (ContaPoupanca contaPoup : listaContaPoupanca) {
            if (contaPoup.getNumConta().equalsIgnoreCase(numconta)) {

                if(saque > contaPoup.getSaldo()){
                    System.out.println("\nVocê não tem saldo suficiente para sacar!");
                    return newSaldo;
                }

                if (saque <= contaPoup.getSaldo()){
                    newSaldo = contaPoup.getSaldo() - saque;
                    contaPoup.setSaldo(newSaldo);
                    System.out.println("\n[ ------------------------------------------------------ ]");
                    System.out.println("[ ------- Saque Realizado com sucesso!   ------- ]\n[ ------- Seu saldo agora é de: " + formata.format(contaPoup.getSaldo()) + "  ------- ]\n");
                    System.out.println("[ ------------------------------------------------------ ]");
                    return newSaldo;
                }

            }
        }
        return newSaldo;
    }

    public ContaPoupanca cadastrarContaPoupanca(String nomeCliente, String numConta, int diaRendimento){
        List<ContaPoupanca> listaContaPoupanca = Teste.DB_CONTASPOUPANCA;

        listaContaPoupanca.add(new ContaPoupanca(nomeCliente,numConta,diaRendimento));
        System.out.println("\n\n[ ------------------------------------------------------ ]");
        System.out.println("[ ------- Conta poupança cadastrada com sucesso! ------- ]");
        System.out.println("[ ------------------------------------------------------ ]");

        return ContaPoupanca.this;
    }

    @Override
    public String toString() {

        return  "\n" +"Nome do Favorecido:" + this.getNomeCliente() + "\n" +
                "Número da conta: " + this.getNumConta() + "\n" +
                "Dia de Rendimento: " + this.getDiaRendimento() + "\n" +
                "Saldo atual da conta: " + formata.format(this.getSaldo());
    }
}
