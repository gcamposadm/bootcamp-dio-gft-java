package me.dio.desafios.bancodigital;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valorDeposito) {
        saldo = saldo + valorDeposito;
    }

    @Override
    public void sacar(double valorSaque) {
        saldo = saldo - valorSaque;
    }

    @Override
    public void transferir(Conta contaDestino, double valorTransferir) {
        this.sacar(valorTransferir);
        contaDestino.depositar(valorTransferir);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirAgNumSaldo() {
        System.out.printf("Titular: %s", this.cliente.getNome());
        System.out.printf("\nAgencia: %d", this.agencia);
        System.out.printf("\nNumero: %d", this.numero);
        System.out.printf("\nSaldo: %.2f\n", this.saldo);
    }
}