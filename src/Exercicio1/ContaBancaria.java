package Exercicio1;

public abstract class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, String numConta) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = 0.0;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double sacar(double valorSaque){
        double saldo = this.saldo;
        if (saldo <= 0){
            System.out.printf("Warning: Saldo Insuficiente");
            return 0.0;
        }
        if (saldo < valorSaque){
            System.out.printf("Warning: Saldo Insuficiente");
            System.out.printf("[---- Você tem disponível para saque o saldo de: R$ " + saldo + " ----]");
            return saldo;
        }
        if (saldo > valorSaque){
            double saldoAtualizado = saldo - valorSaque;
            System.out.printf("Success: Saque realizado com sucesso");
            System.out.printf("[---- Você tem disponível para saque ainda o valor de: R$ " + saldo + " ----]");
            return saldoAtualizado;
        }
        return saldo;
    }


    public double depositar(String numconta, double deposito){
        return 0.0;
    }


}
