public abstract class AnimalVoadorAB extends AnimalAB {
    protected final String TIPO = "Voador";
    protected int qtdAsas;
    protected int envergaduraAsas;
    protected int distanciaVoo;

    public AnimalVoadorAB(String nome, int idade, double altura, double peso, String habitat) {
        super(nome, idade, altura, peso, habitat);
        this.qtdAsas = qtdAsas;
        this.envergaduraAsas = envergaduraAsas;
        this.distanciaVoo = 0; //começa com 0;
    }

    public void moverse(){
        voar();
    }

    private void voar(){
        distanciaVoo++;
    }

    public int getDistanciaVoo() {
        return distanciaVoo;
    }

    public int getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public int getQtdAsas() {
        return qtdAsas;
    }

    public String getTipo(){
        return TIPO;
    }
}
