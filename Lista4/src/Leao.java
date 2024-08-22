public class Leao extends AnimalTerrestreAB{
    private final String ANIMAL = "Leão";

    public Leao(String nome, int idade, double altura, double peso, String habitat) {
        super(nome, idade, altura, peso, habitat);
        this.qtdPatas = 4;
    }
}
