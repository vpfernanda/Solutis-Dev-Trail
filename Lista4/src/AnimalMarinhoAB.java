public abstract class AnimalMarinhoAB extends AnimalAB {
    protected final String TIPO = "Marinho";
    protected int distanciaNado;
    protected String animal;

    public AnimalMarinhoAB(String animal, String nome, int idade, double altura, double peso, String habitat) {
        super(nome, idade, altura, peso, habitat);
        this.distanciaNado = 0; //variavel começa com 0
        this.animal = animal;
    }

    //o animal marinho se move nadando...
    @Override
    public void moverse() {
        nadar();
    }

    public void nadar(){
        distanciaNado++;
    }

    /*Getters*/
    public String getTIPO(){
        return TIPO;
    }

    public String getAnimal() {
        return animal;
    }

    public int getDistanciaNado(){
        return distanciaNado;
    }

    /*Setters*/

    public void setDistanciaNado(int distanciaNado) {
        this.distanciaNado = distanciaNado;
    }

}
