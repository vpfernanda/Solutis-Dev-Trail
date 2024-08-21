package questao11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();
        System.out.println("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();
        System.out.println("Palavras em ordem alfabética:");
        if(palavra1.compareToIgnoreCase(palavra2)<0){
            System.out.println(palavra1);
            System.out.println(palavra2);
        }
        else if(palavra1.compareToIgnoreCase(palavra2)>0){
            System.out.println(palavra2);
            System.out.println(palavra1);
        }
        else System.out.println("As palavras "+palavra1+" e "+palavra2+" são iguais.");

        if(palavra1.length()>palavra2.length())
            System.out.println("A palavra "+palavra1+" tem mais caracteres. ("+palavra1.length()+" caracteres).");
        else if(palavra1.length()<palavra2.length())
            System.out.println("A palavra "+palavra2+" tem mais caracteres. ("+palavra2.length()+" caracteres).");
        else
            System.out.println("Ambas as palavras tem "+palavra1.length()+" caracteres.");

        scanner.close();
    }
}
