package q11;


import q8_q9_q10.Funcionario;
import q8_q9_q10.Gerente;
import q8_q9_q10.Supervisor;
import q8_q9_q10.Vendedor;

public class FuncionariosMain {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

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
            System.out.println(func.toString());
        }

    }
}

