public abstract class AnimalMarinhoAB extends AnimalAB {
    protected final String TIPO = "Marinho";
    protected int distanciaNado;

    public int getDistanciaNado() {
        return distanciaNado;
    }

    public AnimalMarinhoAB(String nome, int idade, double altura, double peso, String habitat) {
        super(nome, idade, altura, peso, habitat);
        this.distanciaNado = 0; //variavel começa com 0
    }

    //o animal marinho se move nadando...
    @Override
    public void moverse() {
        nadar();
    }

    //se ele
    public void nadar(){
        distanciaNado++;
    }

    public String getTipo(){
        return TIPO;
    }

}
