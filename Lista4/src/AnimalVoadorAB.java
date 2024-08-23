public abstract class AnimalVoadorAB extends AnimalAB {
    protected final String TIPO = "Voador";
    protected String animal;
    protected int qtdAsas;
    protected int envergaduraAsas;
    protected int distanciaVoo;

    public AnimalVoadorAB(String animal, String nome, int idade, double altura, double peso, String habitat, int qtdAsas, int envergaduraAsas) {
        super(nome, idade, altura, peso, habitat);
        this.qtdAsas = qtdAsas;
        this.envergaduraAsas = envergaduraAsas;
        this.distanciaVoo = 0; //começa com 0;
        this.animal = animal;
    }

    public void moverse(){
        voar();
    }

    private void voar(){
        distanciaVoo++;
    }

    /*Getters*/
    public int getDistanciaVoo() {
        return distanciaVoo;
    }

    public int getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public int getQtdAsas() {
        return qtdAsas;
    }

    public String getTIPO(){
        return TIPO;
    }

    /*Setters*/

    public void setQtdAsas(int qtdAsas) {
        this.qtdAsas = qtdAsas;
    }

    public void setEnvergaduraAsas(int envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }

    public void setDistanciaVoo(int distanciaVoo) {
        this.distanciaVoo = distanciaVoo;
    }
}
