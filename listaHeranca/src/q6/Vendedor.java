package q6;

import q3.Empregado;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String telefone, String endereco, int codigoSetor,
                    double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calculaComissao(){
        return valorVendas * comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + calculaComissao();
    }
}
