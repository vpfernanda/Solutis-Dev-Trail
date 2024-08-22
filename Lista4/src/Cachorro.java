public class Cachorro extends AnimalTerrestreAB{
    private final String ANIMAL = "Cachorro";

    public Cachorro(String nome, int idade, double altura, double peso, String habitat) {
        super(nome, idade, altura, peso, habitat);
        qtdPatas = 4;
    }
}
