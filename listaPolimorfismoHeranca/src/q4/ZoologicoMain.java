package q4;

import q1.Animal;
import q1.Cachorro;
import q1.Cavalo;
import q1.Preguica;

public class ZoologicoMain {
    public static void main(String[] args) {
        int animaisEnjaulados = 10;
        Zoologico zoo = new Zoologico(animaisEnjaulados);
        for(int i=0; i<animaisEnjaulados; i++){
            if(i%3==0){
                Animal cachorro = new Cachorro("Cachorro"+i, i+1);
                zoo.colocaAnimalNaJaula(cachorro, i);
            }
            else if(i%2==0){
                Animal preguica = new Preguica("Preguica"+i, i);
                zoo.colocaAnimalNaJaula(preguica,i);
            }
            else{
                Animal cavalo = new Cavalo("Cavalo"+i, i);
                zoo.colocaAnimalNaJaula(cavalo,i);
            }
            System.out.println();
        }

        for (int i=0; i<animaisEnjaulados; i++){
            System.out.println("Animal "+(i+1)+" :");
            zoo.visitaJaula(i);
        }
    }
}
