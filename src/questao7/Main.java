package questao7;

public class Main {
    public static void main(String[] args) {
        double resultadoDouble;
        int resultadoInt;


        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0) { //i é múltiplo de 3?
                resultadoDouble = i / 2.0;
                resultadoInt = i/2;
                System.out.println("COM TIPO INT: " + i + " / 2 = " + resultadoInt);
                System.out.println("COM TIPO DOUBLE: " + i + " / 2 = " + resultadoDouble);
            }
        }
        //observa-se que na saída do resultado Int há uma perda da informação fracionária do número.
    }
}
