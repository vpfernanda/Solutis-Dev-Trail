package q5;

public class OperarioTesteMain {
    public static void main(String[] args) {
        Operario op = new Operario("Alex", "33999999999", "Avenida Santos, 2501",
                7, 1800, 0.06, 100, 0.20);

        System.out.println("Nome: " + op.getNome());
        System.out.println("Telefone: " + op.getTelefone());
        System.out.println("Endereço: " + op.getEndereco());
        System.out.println("Código do Setor: " + op.getCodigoSetor());
        System.out.printf("Salário Base: R$ %.2f\n", op.getSalarioBase());
        System.out.printf("Imposto: %.2f%%\n", op.getImposto() * 100);
        op.setQtdArtigos(21); //operário produziu 21 artigos
        System.out.printf("Valor total do que foi produzido pelo operario: R$ %.2f\n", op.calculaTotalProducao());
        System.out.printf("Salário Total (com comissao e desconto de impostos): R$ %.2f\n", op.calcularSalario());
    }
}
