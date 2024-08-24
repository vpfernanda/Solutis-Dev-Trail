package q2;

import q1.Pessoa;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String telefone, String endereco, double valorCredito) {
        super(nome, telefone, endereco);
        this.valorCredito = valorCredito;
        valorDivida = 0;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void registrarDivida(double Divida) {
        this.valorDivida += Divida;
    }

    public double obterSaldo(){
        return valorCredito - valorDivida;
    }
}
