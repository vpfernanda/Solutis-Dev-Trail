package q7;

import q5_q6.Funcionario;
import q5_q6.FuncionarioEducacaoBasica;
import q5_q6.FuncionarioEnsinoMedio;
import q5_q6.FuncionarioGraduado;


public class FuncionariosMain {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        double totalRendaBasica = 0;
        double totalRendaBasicaEducBasica = 0;
        double totalRendaBasicaEnsMedio = 0;
        double totalRendaBasicaGrad = 0;
        double totalSalarios = 0;
        double totalSalariosEducBasica = 0;
        double totalSalariosEnsMedio = 0;
        double totalSalariosGrad = 0;

        // Distribuindo os funcionários
        funcionarios[0] = new FuncionarioEducacaoBasica("José", 101, 1200, "Escola A");
        funcionarios[1] = new FuncionarioEducacaoBasica("Maria", 102, 1200, "Escola C");
        funcionarios[2] = new FuncionarioEducacaoBasica("Pedro", 103, 1300, "Escola A");
        funcionarios[3] = new FuncionarioEducacaoBasica("Ana", 104, 1400,"Escola B");
        funcionarios[4] = new FuncionarioEnsinoMedio("Carlos", 105, 1500, "Escola A", "Escola C");
        funcionarios[5] = new FuncionarioEnsinoMedio("Beatriz", 106, 1500, "Escola B", "Escola D");
        funcionarios[8] = new FuncionarioEnsinoMedio("Bruno", 109, 1600, "Escola A", "Escola C");
        funcionarios[9] = new FuncionarioEnsinoMedio("Carla", 110, 1600, "Escola B", "Escola B");
        funcionarios[6] = new FuncionarioGraduado("Paulo", 107, 2100, "Escola A", "Escola C", "Universidade X");
        funcionarios[7] = new FuncionarioGraduado("Fernanda", 108,2300, "Escola B", "Escola D", "Universidade Y");

        for(Funcionario func : funcionarios){
            totalSalarios += func.getSalario();
            totalRendaBasica += func.getRendaBasica();
            if (func instanceof FuncionarioGraduado) {
                totalSalariosGrad += func.getSalario();
                totalRendaBasicaGrad += func.getRendaBasica();
            }
            else if (func instanceof FuncionarioEnsinoMedio ) {
                totalSalariosEnsMedio += func.getSalario();
                totalRendaBasicaEnsMedio += func.getRendaBasica();
            }
            else if (func instanceof FuncionarioEducacaoBasica) {
                totalSalariosEducBasica += func.getSalario();
                totalRendaBasicaEducBasica += func.getRendaBasica();
            }
        }

     System.out.println("Soma dos salários de todos os funcionarios: "+ totalSalarios);
     System.out.println("Soma da Renda Basica de todos os funcionarios: "+ totalRendaBasica);
     System.out.println("Totais - Renda Básica por escolaridade");
     System.out.println("* Ensino Básico: " + totalRendaBasicaEducBasica);
     System.out.println("* Ensino Médio: " + totalRendaBasicaEnsMedio);
     System.out.println("* Graduados: " + totalRendaBasicaGrad);
     System.out.println("Totais - Salário por escolaridade");
     System.out.println("* Ensino Básico: " + totalSalariosEducBasica);
     System.out.println("* Ensino Médio: " + totalSalariosEnsMedio);
     System.out.println("* Graduados: " + totalSalariosGrad);
    }
}

