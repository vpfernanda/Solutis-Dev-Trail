package questao10;

public class ContadorCaracteres {
    private String string;
    private int vogais;

    public int getVogais() {
        return vogais;
    }

    public int getConsoantes() {
        return consoantes;
    }

    public int getEspacos() {
        return espacos;
    }

    private int consoantes;
    private int espacos;
    private final char[] ARRAY_VOGAIS = {'a', 'e', 'i', 'o', 'u'};
    private final char[] ARRAY_CONSOANTES = {
            'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
            'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'
    };

    ContadorCaracteres(String string){
        this.string = string.toLowerCase();
        vogais = 0;
        consoantes = 0;
        espacos = 0;
    }

    public void analisarString(){
        boolean encontrou;
        for (char caracterString : string.toCharArray()){
            if(caracterString==' '){
                espacos++;
                continue; //segue o loop for.
            }
            encontrou = false; //então não encontramos espaço em branco.

            for(char vogal : ARRAY_VOGAIS){
                if(caracterString==vogal){
                    vogais++;
                    encontrou = true;
                    break; //se encontrou, sai do for de análise das vogais.
                }
            }

            if(encontrou) //se encontrou vogal, segue o for...
                continue;

            for(char consoante : ARRAY_CONSOANTES){
                if(caracterString==consoante){
                    consoantes++;
                    break; //encontramos consoante, sai do for de análise das consoantes.
                }
            }

        }
    }


}
