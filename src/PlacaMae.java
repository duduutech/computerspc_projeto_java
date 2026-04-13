public class PlacaMae {
    private String modelo;
    private CPU cpu;
    private MemoriaRam memoriaRam;

    public PlacaMae(String modelo, int nucleos, String modeloCPU, int capacidadeGB) {
        this.modelo = modelo;
        //não teremos composição
        this.cpu = new CPU(modeloCPU, nucleos); //Obrigatorio
        this.memoriaRam = new MemoriaRam(capacidadeGB); //Obrigatorio
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public MemoriaRam getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(MemoriaRam memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void getDetalhe(){
        System.out.println("Modelo Placa Mãe" + modelo);
        System.out.println("Modelo Processador: " + cpu.getModelo());
        System.out.println("Número de Núcleos: " + cpu.getNucleos());
        System.out.println("Quantidade de memória RAM em GB: " + getMemoriaRam());

    }


}
