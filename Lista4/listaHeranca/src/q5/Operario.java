package q5;

import q3.Empregado;

public class Operario extends Empregado {
    private double valorProducao;
    private int qtdArtigos;
    private double comissao;

    public Operario(String nome, String telefone, String endereco, int codigoSetor, double salarioBase,
                    double imposto, double valorProducao, double comissao) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
        qtdArtigos = 0;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQtdArtigos() {
        return qtdArtigos;
    }

    public void setQtdArtigos(int qtdArtigos) {
        this.qtdArtigos = qtdArtigos;
    }

    public double getComissao() {
        return comissao;
    }


    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calculaTotalProducao(){
        return valorProducao * qtdArtigos;
    }

    @Override
    public double calcularSalario() {
        double totalProducao = calculaTotalProducao();
        double comissaoOperario = comissao * totalProducao;
        return super.calcularSalario() + comissaoOperario;
    }
}
