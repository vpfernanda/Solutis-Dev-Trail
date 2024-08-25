package q5_q6;

public class FuncionarioEducacaoBasica extends Funcionario{
    protected String escolaEnsinoBasico;

    public FuncionarioEducacaoBasica(String nome, int codigoFunc, double salario, String escolaEnsinoBasico) {
        super(nome, codigoFunc, salario);
        this.escolaEnsinoBasico = escolaEnsinoBasico;
        this.rendaBasica = super.rendaBasica * 1.10;
    }

    public String getEscolaEnsinoBasico() {
        return escolaEnsinoBasico;
    }

    public void setEscolaEnsinoBasico(String escolaEnsinoBasico) {
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }
}
