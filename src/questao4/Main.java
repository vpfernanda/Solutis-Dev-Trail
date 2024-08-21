package questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de milhas: ");
        double milhas = scanner.nextDouble();
        double km = milhas * 1.609;
        System.out.println(milhas+" milhas equivalem a "+km+" km.");
        scanner.close();
    }
}
