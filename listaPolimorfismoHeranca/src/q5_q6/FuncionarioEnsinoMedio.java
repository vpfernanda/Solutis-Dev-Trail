package q5_q6;

public class FuncionarioEnsinoMedio extends FuncionarioEducacaoBasica{
    protected String escolaEnsinoMedio;

    public FuncionarioEnsinoMedio(String nome, int codigoFunc, double salario, String escolaEnsinoBasico, String escolaEnsinoMedio) {
        super(nome, codigoFunc, salario, escolaEnsinoBasico);
        this.escolaEnsinoMedio = escolaEnsinoMedio;
        this.rendaBasica = super.rendaBasica * 1.50;
    }

    public String getEscolaEnsinoMedio() {
        return escolaEnsinoMedio;
    }

    public void setEscolaEnsinoMedio(String escolaEnsinoMedio) {
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }
}
