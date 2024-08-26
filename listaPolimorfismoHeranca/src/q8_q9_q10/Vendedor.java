package q8_q9_q10;

public class Vendedor extends Funcionario{

    public Vendedor(String nome, int codigoFunc, double salario) {
        super(nome, codigoFunc, salario);
        this.comissao = 250;
    }

    @Override
    public String toString(){
        return super.toString() + "\nComissão: "+getComissao();
    }

}
