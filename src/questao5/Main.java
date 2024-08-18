package questao5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] diasSemana = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira",
                "Sábado", "Domingo"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número (1 a 7): ");
        int dia = scanner.nextInt();


        if(dia >= 1 && dia <=7)
            System.out.println(diasSemana[dia-1]);
            //descontamos 1 no valor digitado para que fique compatível com os
            // índices do array, que iniciam em 0.
        else
            System.out.println("Você digitou "+dia+" que não é uma entrada válida para o dia da semana.");


    }
}
