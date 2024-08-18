package questao6;

public class Main {
    public static void main(String[] args) {
        int inicioInt = 15;
        int fimInt = 30;
        int produtoInt = 1;
        float inicioFloat = 15;
        float fimFloat = 30;
        float produtoFloat = 1;

        //Imprimindo o produto dos ímpares usando int
        for(int i=inicioInt; i<fimInt; i++){
            if(i%2!=0)
                produtoInt *= i;
        }//teremos um estouro pois a variável tipo int não comporta um valor tão grande.

        //Imprimindo o produto dos ímpares usando float
        for(float i=inicioFloat; i<fimFloat; i++){
            if(i%2!=0)
                produtoFloat *= i;
        } //float comporta o resultado.

        System.out.println("Produto dos ímpares usando int: "+produtoInt);
        System.out.println("Produto dos ímpares usando float: "+produtoFloat);
    }
}
