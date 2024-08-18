package questao3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        Primos numeroAVerificar = new Primos(numero);
        numeroAVerificar.encontraPrimos();
        ArrayList<Integer> listaPrimos;
        listaPrimos = numeroAVerificar.getPrimos();

        for(Integer p : listaPrimos){
            System.out.println(p+" ");
        }


    }
}
