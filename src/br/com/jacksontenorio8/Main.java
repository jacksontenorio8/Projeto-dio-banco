package br.com.jacksontenorio8;

public class Main {
    public static void main(String[] args) {
        Cliente Jackson = new Cliente();
        Jackson.setNome("Jackson");

        Conta cc = new ContaCorrente(Jackson);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(Jackson);
        cc.ted(20, cp);
        cc.pix(80, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
