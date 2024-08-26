package q5_q6;

public class FuncionarioGraduado extends FuncionarioEnsinoMedio{
    protected String universidade;

    public FuncionarioGraduado(String nome, int codigoFunc, double salario, String escolaEnsinoBasico,
                               String escolaEnsinoMedio, String universidade)
    {
        super(nome, codigoFunc, salario, escolaEnsinoBasico, escolaEnsinoMedio);
        this.universidade = universidade;
    }

    @Override
    public double calculaRendaBasica() {
        return super.calculaRendaBasica()*2.0;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
}
