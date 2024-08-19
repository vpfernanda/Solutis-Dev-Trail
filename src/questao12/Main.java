package questao12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quilometragemTotal = 0;
        int litrosTotais = 0;
        int contadorTanques = 0;
        int litrosConsumidos = 0;

        while (true) {
            System.out.println("Digite a quilometragem dirigida (ou -1 para sair): ");
            int quilometragem = scanner.nextInt();
            if (quilometragem == -1) {
                break;  //Interrompe o recebimento de inputs.
            }

            System.out.println("Digite a quantidade de litros consumidos: ");
            litrosConsumidos = scanner.nextInt();

            contadorTanques++;
            quilometragemTotal += quilometragem;
            litrosTotais += litrosConsumidos;

            // Consumo em quilômetros por litro
            float consumoPorTanque = (float) quilometragem / (float) litrosConsumidos;
            System.out.println("Consumo do tanque "+contadorTanques+" : "+consumoPorTanque+"km/l");

            // Exibe a quilometragem e o consumo total até o momento
            float consumoMedioTotal = (float) quilometragemTotal / (float) litrosTotais;
            System.out.println("Quilometragem combinada até agora: "+quilometragemTotal+ " km");
            System.out.println("Litros totais consumidos: "+litrosTotais+" L");
            System.out.println("Consumo médio total: "+consumoMedioTotal+ " km/l");
        }

        // Mensagem final quando o loop é encerrado
        System.out.println("Fim da execução.");
        scanner.close();
    }
}
