package questao2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        System.out.println(retornaMaior(numero1, numero2));
        scanner.close();
    }

    public static String retornaMaior(int num1, int num2){
        if(num1>num2)
            return "\nO maior é: "+num1;
        if (num2>num1)
            return "\nO maior é:"+num2;
        //são iguais?
        return "\nOs números são iguais.";
    }
}