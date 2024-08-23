public class Cachorro extends AnimalTerrestreAB{
    private static final String ANIMAL = "Cachorro";

    public Cachorro(String nome, int idade, double altura, double peso, String habitat) {
        super(ANIMAL, nome, idade, altura, peso, habitat);
        qtdPatas = 4; //ora, cachorros são quadrúpedes.
    }

    @Override
    public void moverse() {
        super.moverse();
        System.out.println(ANIMAL+ " andou.");
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println(ANIMAL+" comeu.");
    }

    @Override
    public void dormir() {
        super.dormir();
        System.out.println(ANIMAL+" dormiu.");
    }
}
