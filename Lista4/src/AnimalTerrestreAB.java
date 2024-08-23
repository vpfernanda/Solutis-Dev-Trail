public abstract class AnimalTerrestreAB extends AnimalAB{
    protected final String TIPO = "Terrestre";
    protected String animal;
    protected int distanciaPercorrida;
    protected int qtdPatas;


    public AnimalTerrestreAB(String animal, String nome, int idade, double altura, double peso, String habitat) {
        super(nome, idade, altura, peso, habitat);
        this.distanciaPercorrida = 0;
        this.animal = animal;
    }

    //a forma como se movem é a diferença entre Terrestre, Marinho e Voador.
    public void moverse(){
        distanciaPercorrida++;
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    /*Getters*/
    public String getTIPO() {
        return TIPO;
    }

    public String getAnimal() {
        return animal;
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    /*Setters*/

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }
}
