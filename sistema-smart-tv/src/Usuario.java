public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(10);
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);


        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

    }
}
