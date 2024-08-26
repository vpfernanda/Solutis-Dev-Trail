package q8_q9_q10;

public class Gerente extends Funcionario{
    public Gerente(String nome, int codigoFunc, double salario) {
        super(nome, codigoFunc, salario);
        this.comissao = 1500;
    }

    @Override
    public String toString(){
        return super.toString() + "\nComissão: "+getComissao();
    }
}
