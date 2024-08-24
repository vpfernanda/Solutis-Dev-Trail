package q4;


public class TesteAdministradorMain {
    public static void main(String[] args) {
        Administrador adm = new Administrador("Pedro", "11999999999", "Rua das Flores, 20",
                5, 2500, 0.08, 500);

        System.out.println("Nome: " + adm.getNome());
        System.out.println("Telefone: " + adm.getTelefone());
        System.out.println("Endereço: " + adm.getEndereco());
        System.out.println("Código do Setor: " + adm.getCodigoSetor());
        System.out.printf("Salário Base: R$ %.2f\n", adm.getSalarioBase());
        System.out.printf("Imposto: %.2f%%\n", adm.getImposto() * 100);
        System.out.printf("Ajuda de custo: R$ %.2f\n", adm.getAjudaDeCusto());
        System.out.printf("Salário Total (com ajuda de custo e desconto de impostos): R$ %.2f\n", adm.calcularSalario());


    }
}
