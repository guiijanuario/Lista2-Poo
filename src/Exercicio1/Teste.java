package Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Teste {
    //banco de dados do banco zup
    public static List<ContaPoupanca> DB_CONTASPOUPANCA = new ArrayList<>();
    public static List<ContaEspecial> DB_CONTASESPECIAIS = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\n[ ----- Banco Zup Catalisa - Seja Bem vindo ----- ]");

        boolean sair = false;
        do {

            System.out.print("\n\n[-----------------------------------]\n[ 1 - Criar conta                   ]\n[ 2 - Sacar                         ]\n[ 3 - Depositar                     ]\n[ 4 - Ver rendimento da minha conta ]\n[ 5 - Mostrar conta do cliente      ]\n[ X - Sair                          ]\n[-----------------------------------]\n-> ");

            String opcao = new Scanner(System.in).nextLine().toLowerCase();

            switch (opcao){
                case "1":
                    System.out.print("\n[-----------------------------------]");
                    System.out.print("\nDigite o nome Cliente: ");
                    String nomeCliente = scanner.nextLine();
                    if (nomeCliente.equalsIgnoreCase(" ")) {
                        System.out.println("É necessário digitar um nome!");
                    }

                    System.out.print("Você quer criar uma conta especial ou poupança?\n 1 - Conta Poupança\n 2 - Conta Especial" + "\n->");
                    String respConta = scanner.nextLine();

                    if (respConta.equalsIgnoreCase("1")) {
                        System.out.print("Digite o número da conta do cliente: " + "\n->");
                        String numConta = scanner.nextLine();
                        for (ContaPoupanca contaPoup : DB_CONTASPOUPANCA) {
                            if (contaPoup.getNumConta().equals(numConta)) {
                                System.out.print("\nEstá conta já está cadastrada em nosso sistema. ");
                                System.out.print("\nDigite novamente uma novo número: " + "\n->");
                                numConta = scanner.nextLine();

                            }
                        }
                        System.out.print("Qual o dia de rendimento da conta poupança? " + "\n->");
                        int diaRendimento = scanner.nextInt();
                        new ContaPoupanca(nomeCliente,numConta,diaRendimento).cadastrarContaPoupanca(nomeCliente,numConta,diaRendimento);
                    }

                    if (respConta.equalsIgnoreCase("2")) {
                        System.out.print("Digite o número da conta do cliente: ");
                        String numConta = scanner.nextLine();
                        for (ContaEspecial contaEsp : DB_CONTASESPECIAIS) {
                            if (contaEsp.getNumConta().equals(numConta)) {
                                System.out.print("\nEstá conta já está cadastrada em nosso sistema. ");
                                System.out.print("\nDigite novamente uma novo número: " + "\n->");
                                numConta = scanner.nextLine();

                            }
                        }
                            System.out.print("Qual o limite especial para este cliente? " + "\n->");
                            double limite = scanner.nextDouble();
                            new ContaEspecial(nomeCliente,numConta,limite).cadastrarContaEspecial(nomeCliente,numConta,limite);
                    }


                    break;
                case "2":
                    System.out.printf("\n[------ Menu de saque -------]\n");
                    System.out.print("Você quer sacar em qual conta?\n 1 - Conta Poupança\n 2 - Conta Especial" + "\n->");
                    String respContaDep = scanner.nextLine();

                    if (respContaDep.equalsIgnoreCase("1")) {
                        System.out.print("Digite o número da conta do cliente: ");
                        String numConta = scanner.nextLine();
                        for (ContaPoupanca contaPoup : DB_CONTASPOUPANCA) {
                            if (contaPoup.getNumConta().equals(numConta)) {
                                System.out.print("\nEncontrei a seguinte conta \n" + contaPoup);
                                System.out.print("\n\nQuanto você deseja sacar?" + "\n->");
                                double saque = scanner.nextDouble();
                                contaPoup.sacar(numConta,saque);
                            }
                        }
                    }

                    if (respContaDep.equalsIgnoreCase("2")) {
                        System.out.print("Digite o número da conta do cliente: ");
                        String numConta = scanner.nextLine();
                        for (ContaEspecial contaEsp : DB_CONTASESPECIAIS) {
                            if (contaEsp.getNumConta().equals(numConta)) {
                                System.out.print("\nEncontrei a seguinte conta \n" + contaEsp);
                                System.out.print("\n\nQuanto você deseja depositar?" + "\n->");
                                double deposito = scanner.nextDouble();
                                contaEsp.depositar(numConta,deposito);
                            }
                        }
                    }
                    break;
                case "3":
                    System.out.printf("\n[------ Menu de depositar -------]\n");
                    System.out.print("Você quer depositar em qual conta?\n 1 - Conta Poupança\n 2 - Conta Especial" + "\n->");
                    respContaDep = new Scanner(System.in).nextLine();

                    if (respContaDep.equalsIgnoreCase("1")) {
                        System.out.print("Digite o número da conta do cliente: ");
                        String numConta = scanner.nextLine();
                        for (ContaPoupanca contaPoup : DB_CONTASPOUPANCA) {
                            if (contaPoup.getNumConta().equals(numConta)) {
                                System.out.print("\nEncontrei a seguinte conta \n" + contaPoup);
                                System.out.print("\n\nQuanto você deseja depositar?" + "\n->");
                                double deposito = scanner.nextDouble();
                                contaPoup.depositar(numConta,deposito);
                            }
                        }
                    }

                    if (respContaDep.equalsIgnoreCase("2")) {
                        System.out.print("Digite o número da conta do cliente: ");
                        String numConta = scanner.nextLine();
                        for (ContaEspecial contaEsp : DB_CONTASESPECIAIS) {
                            if (contaEsp.getNumConta().equals(numConta)) {
                                System.out.print("\nEncontrei a seguinte conta \n" + contaEsp);
                                System.out.print("\n\nQuanto você deseja depositar?" + "\n->");
                                double deposito = scanner.nextDouble();
                                contaEsp.depositar(numConta,deposito);
                            }
                        }
                    }
                    break;
                case "4":
                    System.out.printf("\n[------ Mostrar o Rendimento -------]\n");
                    System.out.print("Insira o número da sua conta poupança: ");
                    String numConta = scanner.nextLine();
                    for (ContaPoupanca contaPoup : DB_CONTASPOUPANCA) {
                        if (contaPoup.getNumConta().equals(numConta)) {
                            System.out.print("\nEncontrei a seguinte conta \n" + contaPoup);
                            System.out.print("\nQual é a taxa de rendimento?" + "\n->");
                            double taxaRendimento = scanner.nextDouble();
                            contaPoup.calcularNovoSaldo(taxaRendimento);
                        }
                    }


                    break;
                case "5":
                    System.out.printf("\n[------ Mostrar conta -------]\n");
                    System.out.print("Você conta você quer acessar?\n 1 - Conta Poupança\n 2 - Conta Especial" + "\n->");
                    String respContaVer = scanner.nextLine();

                    if (respContaVer.equalsIgnoreCase("1")) {
                        System.out.print("Digite o número da conta do cliente: ");
                        numConta = scanner.nextLine();
                        for (ContaPoupanca contaPoup : DB_CONTASPOUPANCA) {
                            if (contaPoup.getNumConta().equals(numConta)) {
                                System.out.print("\nEncontrei a seguinte conta \n" + contaPoup);
                            }
                        }
                    }

                    if (respContaVer.equalsIgnoreCase("2")) {
                        System.out.print("Digite o número da conta do cliente: ");
                        numConta = scanner.nextLine();
                        for (ContaEspecial contaEsp : DB_CONTASESPECIAIS) {
                            if (contaEsp.getNumConta().equals(numConta)) {
                                System.out.print("\nEncontrei a seguinte conta \n" + contaEsp);
                            }
                        }
                    }
                    break;
                case "x":
                    sair = true;
                    System.out.printf("Encerrando o sistema!");
                    break;
                default:
                    System.out.printf("Digite uma opção válida.");
                    break;
            }
        }while (!sair);
    }
}