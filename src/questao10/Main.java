package questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String string = scanner.nextLine();
        ContadorCaracteres contador = new ContadorCaracteres(string);
        contador.analisarString();
        System.out.println("Vogais: "+contador.getVogais());
        System.out.println("Consoantes: "+contador.getConsoantes());
        System.out.println("Espaços em branco: "+contador.getEspacos());
    }
}
