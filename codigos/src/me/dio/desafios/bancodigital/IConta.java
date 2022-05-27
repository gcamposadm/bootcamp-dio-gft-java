package me.dio.desafios.bancodigital;

public interface IConta {

    void depositar(double valorDeposito);

    void sacar(double valorSaque);

    void transferir(Conta contaDestino, double valorTransferir);

    void imprimirExtrato();
}
