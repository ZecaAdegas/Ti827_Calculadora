package calculator;

public class Divide {

    public static void dividir() {
        LeDados r = new LeDados();
        r.leValores();
        System.out.println("Divisão:" + (r.valor1 / r.valor2));
    }

}
