package q3;

import q1.Animal;
import q1.Cachorro;
import q1.Cavalo;
import q1.Preguica;

public class VeterinarioMain {
    public static void main(String[] args) {
        Veterinario vet = new Veterinario();
        Animal cachorro, cavalo, preguica;
        cachorro = new Cachorro("Belinha", 2);
        cavalo = new Cavalo("Pocotó", 7);
        preguica = new Preguica("Lazzy", 5);
        vet.examinar(cachorro);
        vet.examinar(cavalo);
        vet.examinar(preguica);
    }
}
