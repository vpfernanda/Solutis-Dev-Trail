package q4;

import q1.*;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico(int numAnimais){
        jaulas = new Animal[numAnimais];
    }

    public void colocaAnimalNaJaula(Animal animal, int indice){
        if(indice < jaulas.length)
            jaulas[indice] = animal;
    }

    public void visitaJaula(int indice){
        if(indice < jaulas.length){
            jaulas[indice].emitirSom();
            if(jaulas[indice] instanceof Cachorro)
                ((Cachorro)jaulas[indice]).correr();
            else if (jaulas[indice] instanceof Cavalo)
                ((Cavalo)jaulas[indice]).correr();
        }
    }


}
