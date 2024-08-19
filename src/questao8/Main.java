package questao8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.next();
        Palindromo palavraParaVerif = new Palindromo(palavra);
        System.out.println(palavraParaVerif.conferePalindromo());
        scanner.close();
    }


}
