package questao8;

public class Palindromo {
    private String palavra;

    public Palindromo(String palavra){
        this.palavra = palavra;
    }

    public String conferePalindromo(){
        palavra = palavra.toLowerCase();
        int tamanho = palavra.length();
        int j = tamanho-1;
        for(int i = 0; i<=j; i++){
            if((palavra.charAt(i)!=palavra.charAt(j)))
                return "Não é palíndromo";
            j--;
        }
        return "Palavra é palíndromo.";
    }


}
