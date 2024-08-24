package q1;

public class TestePessoaMain {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria", "31988899999", "Rua Brasil, 600");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Endereço: " + pessoa.getEndereco());
    }

}
