public class Computador {
    private String modelo;
    private PlacaMae placaMae;//objeto
    private Fonte fonte;//objeto
    private DiscoArmazenamento discoArmazenamento;//objeto

    public Computador(String modelo, String modeloPlacaMae, int nucleos, String modeloCPU,
                      int capacidadeGBmemoria, int potencia, int capacidadeGBHD, String tipo) {
        this.modelo = modelo;
        this.placaMae = new PlacaMae(modeloPlacaMae,nucleos,modeloCPU,capacidadeGBmemoria);
        this.fonte = new Fonte(potencia);
        this.discoArmazenamento = new DiscoArmazenamento(tipo, capacidadeGBHD);
    }

    public String ligar(){
        return "ligado";

    }

    public boolean getEspecificacoes(){
        System.out.println("Modelo Computador: " + modelo);
        System.out.println(ligar());
        System.out.println("Especifica: ");
        placaMae.getDetalhe();
        System.out.println("Fonte potencia: " + fonte.getPotencialWatts());
        System.out.println("Tipo HD: " + discoArmazenamento.getTipo());
        System.out.println("Capacidade HD: " + discoArmazenamento.getCapacidadeGB());
        return false;
    }
}
