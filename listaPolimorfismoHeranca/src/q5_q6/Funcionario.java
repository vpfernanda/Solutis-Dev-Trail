package q5_q6;

public class Funcionario {
    protected String nome;
    protected int codigoFunc;
    protected double rendaBasica;
    protected double salario;

    public Funcionario(String nome, int codigoFunc, double salario) {
        this.nome = nome;
        this.codigoFunc = codigoFunc;
        this.salario = salario;
        rendaBasica = 1000;
    }

    public double getRendaBasica() {
        return rendaBasica;
    }

    public void setRendaBasica(double rendaBasica) {
        this.rendaBasica = rendaBasica;
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
}
