package questao3;

import java.util.ArrayList;

public class Primos {
    private int numero;
    private ArrayList<Integer> primos;

    public Primos (int numero){
        this.numero = numero;
        primos = new ArrayList<>();
    }

    public ArrayList<Integer> getPrimos(){
        return primos;
    }

    public void encontraPrimos() {
        int divisores = 0;
        for(int i=2; i<numero; i++){
            for(int j=i-1; j>=2; j--){
                if(i%j==0)
                    divisores++;
            }
            if(divisores==0)
                primos.add(i);

            divisores = 0;
        }
    }
}
