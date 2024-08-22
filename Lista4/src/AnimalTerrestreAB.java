public abstract class AnimalTerrestreAB extends AnimalAB{
    protected final String TIPO = "Terrestre";
    protected int distanciaPercorrida;
    protected int qtdPatas;

    public AnimalTerrestreAB(String nome, int idade, double altura, double peso, String habitat) {
        super(nome, idade, altura, peso, habitat);
        this.distanciaPercorrida = 0;
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void moverse(){
        distanciaPercorrida++;
    }

    public String getTipo(){
        return TIPO;
    }


}
