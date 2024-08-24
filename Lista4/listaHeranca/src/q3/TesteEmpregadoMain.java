package q3;

public class TesteEmpregadoMain {
    public static void main(String[] args) {
        Empregado employee = new Empregado("Ana", "31999999999", "Rua das Amoras, 120",
                5, 1980, 0.07);

        System.out.println("Nome: " + employee.getNome());
        System.out.println("Telefone: " + employee.getTelefone());
        System.out.println("Endereço: " + employee.getEndereco());
        System.out.println("Código do Setor: " + employee.getCodigoSetor());
        System.out.printf("Salário Base: R$ %.2f\n", employee.getSalarioBase());
        System.out.printf("Imposto: %.2f%%\n", employee.getImposto() * 100);
        System.out.printf("Salário com Desconto de Imposto: R$ %.2f\n", employee.calcularSalario());

    }
}
