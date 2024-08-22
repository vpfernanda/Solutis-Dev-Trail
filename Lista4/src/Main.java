public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Totó", 5, 0.5, 17.5, "Meio rural");
        dog.moverse();
        for(int i=0; i<8; i++)
            dog.dormir(); //dormiu 8 horas.
        System.out.println("Nome do cachorro: "+dog.getNome());
        System.out.println("Distância percorrida pelo cachorro: "+dog.getDistanciaPercorrida());
        System.out.println("Horas dormidas pelo cachorro: "+dog.getHorasDormidas());
    }
}
