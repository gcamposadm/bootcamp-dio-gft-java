package me.dio.desafios.bancodigital;

public class Main {

    public static void main(String[] args) {
        Cliente guilherme = new Cliente();
        guilherme.setNome("Guilherme");

        Conta contaCorente1 = new ContaCorrente(guilherme);
        Conta contaPoupanca1 = new ContaPoupanca(guilherme);

        contaCorente1.depositar(100);
        contaCorente1.transferir(contaPoupanca1, 100);

        contaCorente1.imprimirExtrato();
        contaPoupanca1.imprimirExtrato();

    }
}
