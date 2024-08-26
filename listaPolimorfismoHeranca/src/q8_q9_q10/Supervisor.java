package q8_q9_q10;

public class Supervisor extends Funcionario{
    public Supervisor(String nome, int codigoFunc, double salario) {
        super(nome, codigoFunc, salario);
        this.comissao = 600;
    }

    @Override
    public String toString(){
        return super.toString() + "\nComissão: "+getComissao();
    }
}
