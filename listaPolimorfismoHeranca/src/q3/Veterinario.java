package q3;

import q1.*;

public class Veterinario {

    public void examinar(Animal animal){
        System.out.println("Veterinário examinou "+animal.getNome()+".");
        animal.emitirSom();
    }
}
