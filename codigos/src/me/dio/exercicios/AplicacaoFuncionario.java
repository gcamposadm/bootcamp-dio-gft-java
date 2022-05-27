package me.dio.exercicios;

public class AplicacaoFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

    }
}
