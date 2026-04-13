//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Computador c = new Computador("Pc da XUXA",
                "Modelo XYZ",
                1,
                "Ryzen",
                8,
                750,
                500,
                "HD");
        c.getEspecificacoes();
        System.out.println(c.getEspecificacoes());
    }
}