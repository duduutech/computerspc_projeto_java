public class CPU {

    private String modelo;
    private int nucleos;
    //Construtor
    public CPU(String modelo, int nucleos) {
        this.modelo = modelo;
        this.nucleos = nucleos;
    }
    //get e setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }
}
