package br.com.jacksontenorio8;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        saldo = saldo - valor - 6;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor + 0.005;
    }

    @Override
    public void ted(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void pix(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
