public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("12389");
        // jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("90233");
        // z400.ligar();

        Veiculo coringa = z400;

        coringa.ligar();
    }
}
