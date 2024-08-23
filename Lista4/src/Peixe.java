public class Peixe extends AnimalMarinhoAB{
    private static final String ANIMAL = "Peixe";

    public Peixe(String nome, int idade, double altura, double peso, String habitat) {
        super(ANIMAL, nome, idade, altura, peso, habitat);
    }

    @Override
    public void moverse() {
        super.moverse();
        System.out.println(ANIMAL+ " nadou.");
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
