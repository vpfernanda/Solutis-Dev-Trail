package q8_q9_q10;


public class FuncionariosMain {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        double totalSalarios = 0;
        double totalRendaFunc = 0;
        double totalComissoes = 0;
        double totalSalariosGerentes = 0;
        double totalRendaGerentes = 0;
        double totalComissoesGerentes = 0;
        double totalSalariosSupervisor = 0;
        double totalRendaSupervisor = 0;
        double totalComissoesSupervisor = 0;
        double totalSalariosVendedor = 0;
        double totalRendaVendedor = 0;
        double totalComissoesVendedor = 0;



        // Distribuindo os funcionários
        funcionarios[0] = new Gerente("José", 101, 5000);
        funcionarios[1] = new Supervisor("Maria", 102, 4000);
        funcionarios[2] = new Supervisor("Pedro", 103, 4000);
        funcionarios[3] = new Vendedor("Ana", 104, 1500);
        funcionarios[4] = new Vendedor("Carlos", 105, 1500);
        funcionarios[5] = new Vendedor("Beatriz", 106, 1500);
        funcionarios[8] = new Vendedor("Bruno", 109, 1600);
        funcionarios[9] = new Vendedor("Carla", 110, 1600);
        funcionarios[6] = new Vendedor("Paulo", 107, 2100);
        funcionarios[7] = new Vendedor("Fernanda", 108,2300);

        for(Funcionario func : funcionarios){
            totalSalarios += func.getSalario();
            totalComissoes += func.getComissao();
            totalRendaFunc += func.getRendaTotal();

            if (func instanceof Gerente) {
                totalSalariosGerentes += func.getSalario();
                totalRendaGerentes += func.getRendaTotal();
                totalComissoesGerentes += func.getComissao();
            }
            else if (func instanceof Supervisor ) {
                totalSalariosSupervisor += func.getSalario();
                totalRendaSupervisor += func.getRendaTotal();
                totalComissoesSupervisor += func.getComissao();
            }
            else if (func instanceof Vendedor) {
                totalSalariosVendedor += func.getSalario();
                totalRendaVendedor += func.getRendaTotal();
                totalComissoesVendedor += func.getComissao();
            }
        }

     System.out.println("Soma dos salários de todos os funcionarios: "+ totalSalarios);
     System.out.println("Soma das comissões de todos os funcionarios: "+ totalComissoes);
     System.out.println("Soma da renda (salário+comissão) de todos os funcionarios: "+totalRendaFunc);
     System.out.println("Comissões totais - Por cargo:");
     System.out.println("* Gerente: " + totalComissoesGerentes);
     System.out.println("* Supervisor: " + totalComissoesSupervisor);
     System.out.println("* Vendedor: " + totalComissoesVendedor);
     System.out.println("Salarios totais funcionários - Por cargo");
     System.out.println("* Gerente: " + totalSalariosGerentes);
     System.out.println("* Supervisor: " + totalSalariosSupervisor);
     System.out.println("* Vendedor: " + totalSalariosVendedor);
     System.out.println("Renda (comissão e salário) - Por cargo");
     System.out.println("* Gerente: " + totalRendaGerentes);
     System.out.println("* Supervisor: " + totalRendaSupervisor);
     System.out.println("* Vendedor: " + totalRendaVendedor);
    }
}

