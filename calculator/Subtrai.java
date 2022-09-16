package calculator;

public class Subtrai {

    public static void subtrair() {
        LeDados r = new LeDados();
        r.leValores();
        System.out.println("Subtração:" + (r.valor1 - r.valor2));
    }

}
