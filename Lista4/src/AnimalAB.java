public abstract class AnimalAB implements AnimalIF {
    protected int qtdAlimentosIngeridos;
    protected int horasDormidas;
    protected String nome;
    protected int idade;
    protected double altura;
    protected double peso;
    protected String habitat;

    public AnimalAB(String nome, int idade, double altura, double peso, String habitat) {
        this.qtdAlimentosIngeridos = 0; //nasce com 0.
        this.horasDormidas = 0; //nasce com 0.
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.habitat = habitat;
    }

    /*Implementações da interface*/

    //ora, todos os animais comem! esse method será implementado nesta classe AnimalAB.
    @Override
    public void comer() {
        qtdAlimentosIngeridos++;
    }

    //cada animal (Terrestre/Marinho/Voador) se move de uma forma diferente. Então cada classe
    //abstrata implementa moverse() adequadamente.
    @Override
    public abstract void moverse();

    //ora, todos os animais dormem (ou descansam). esse method será implementado nesta classe AnimalAB.
    @Override
    public void dormir() {
        horasDormidas++;
    }

    /*Getters*/
    public int getQtdAlimentosIngeridos() {
        return qtdAlimentosIngeridos;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getHabitat() {
        return habitat;
    }

    //as classes AnimalMarinhoAB, AnimalTerrestreAB e AnimalVoadorAB serão obrigadas a implementar
    //essa funçao.
    public abstract String getTIPO();


}
