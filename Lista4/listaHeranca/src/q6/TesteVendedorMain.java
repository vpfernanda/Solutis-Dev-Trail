package q6;

public class TesteVendedorMain {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Mariana", "37999999999", "Rua Alameda Bonita, 98",
                3, 2000, 0.07, 1500, 0.25);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.printf("Salário Base: R$ %.2f\n", vendedor.getSalarioBase());
        System.out.printf("Imposto: %.2f%%\n", vendedor.getImposto() * 100);
        System.out.printf("Valor vendido: R$ %.2f\n", vendedor.getValorVendas());
        System.out.printf("Comissão sobre vendas: R$ %.2f\n", vendedor.calculaComissao());
        System.out.printf("Salário Total (com comissão e desconto de impostos): R$ %.2f\n", vendedor.calcularSalario());
    }
}
