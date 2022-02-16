package br.com.jacksontenorio8;

public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void ted(double valor, Conta contaDestino);

    void pix(double valor, Conta contaDestino);

    void imprimirExtrato();
}
