package q2;


import q1.Animal;
import q1.Cachorro;
import q1.Cavalo;
import q1.Preguica;

public class AnimaisMain {
    public static void main(String[] args) {
        Animal cachorro, cavalo, preguica;
        cachorro = new Cachorro("Belinha", 2);
        cavalo = new Cavalo("Pocotó", 7);
        preguica = new Preguica("Lazzy", 5);
        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();
    }
}
