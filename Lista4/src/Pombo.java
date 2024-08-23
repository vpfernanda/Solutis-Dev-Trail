public class Pombo extends AnimalVoadorAB{
    private static final String ANIMAL = "Pombo";

    public Pombo(String nome, int idade, double altura, double peso, String habitat, int qtdAsas, int envergAsas) {
        super(ANIMAL, nome, idade, altura, peso, habitat, qtdAsas, envergAsas);
    }

    @Override
    public void moverse() {
        super.moverse();
        System.out.println(ANIMAL+ " voou.");
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
