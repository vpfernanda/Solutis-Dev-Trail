package questao9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();
        double area = (raio * raio) * PI;
        area = Math.ceil(area); //valor arredondado.
        System.out.println("Área: "+area);
        scanner.close();
    }
}
