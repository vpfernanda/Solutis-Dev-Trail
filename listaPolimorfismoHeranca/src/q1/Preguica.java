package q1;

public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Preguiça emitiu som!");
    }

    public void subirEmArvore(){
        System.out.println("Preguiça subiu na árvore.");
    }
}
