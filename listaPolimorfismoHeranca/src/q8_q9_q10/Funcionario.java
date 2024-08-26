package q8_q9_q10;

public class Funcionario {
    protected String nome;
    protected int codigoFunc;
    protected double salario;
    protected double comissao;

    public Funcionario(String nome, int codigoFunc, double salario) {
        this.nome = nome;
        this.codigoFunc = codigoFunc;
        this.salario = salario;
        comissao = 0;
    }

    public double getRendaTotal(){
        return salario + comissao;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFunc() {
        return codigoFunc;
    }

    public void setCodigoFunc(int codigoFunc) {
        this.codigoFunc = codigoFunc;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString(){
        return "\nNome do funcionário: "+getNome()+
                "\nSalário total: "+getRendaTotal();
    }
}
