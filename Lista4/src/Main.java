public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Totó", 5, 0.5, 17.5, "Meio rural");
        dog.moverse();
        dog.dormir();
        dog.comer();
        System.out.println("Tipo do animal:" + dog.getTIPO());

        Peixe fish = new Peixe("Nemo",2, 0.02, 0.01, "Mar");
        fish.moverse();
        fish.dormir();
        fish.comer();
        System.out.println("Tipo do animal: " + fish.getTIPO());

        Pombo pigeon = new Pombo("Zezinho", 3,0.20,1,"Praças da cidade", 2, 1);
        pigeon.moverse();
        pigeon.dormir();
        pigeon.comer();
        System.out.println("Tipo do animal: " + pigeon.getTIPO());

        Elefante elephant = new Elefante("Dumbo", 2, 1.50, 200, "Savana");
        elephant.moverse();
        elephant.dormir();
        elephant.comer();
        System.out.println("Tipo do animal: " + elephant.getTIPO());

    }
}
