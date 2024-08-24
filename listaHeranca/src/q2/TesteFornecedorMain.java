package q2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TesteFornecedorMain {
    public static void main(String[] args) {
        Fornecedor vendedorCanetas = new Fornecedor("Paulo", "21999999999", "Rua Exemplo, 21", 10000);
        vendedorCanetas.registrarDivida(2000);
        System.out.println("Nome: " + vendedorCanetas.getNome());
        System.out.println("Telefone: " + vendedorCanetas.getTelefone());
        System.out.println("Endereço: " + vendedorCanetas.getEndereco());
        System.out.printf("Valor dívida: R$ %.2f\n",vendedorCanetas.getValorDivida());
        System.out.printf("Valor saldo: R$ %.2f\n",vendedorCanetas.obterSaldo());

    }
}