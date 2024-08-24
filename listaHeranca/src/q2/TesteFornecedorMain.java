package q2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TesteFornecedorMain {
    public static void main(String[] args) {
        Fornecedor canetasLTDA = new Fornecedor("Canetas Bic", "21999999999", "Rua Exemplo, 21", 10000);
        canetasLTDA.registrarDivida(2000);
        System.out.printf("Valor dívida: R$ %.2f\n",canetasLTDA.getValorDivida());
        System.out.printf("Valor saldo: R$ %.2f\n",canetasLTDA.obterSaldo());

    }
}