public class Gato extends AnimalTerrestreAB{
    private static final String ANIMAL = "Gato";

    public Gato(String nome, int idade, double altura, double peso, String habitat) {
        super(ANIMAL, nome, idade, altura, peso, habitat);
        this.qtdPatas = 4; //ora, gatos são quadrúpedes.
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
