package calculator;

public class Multiplica {

    public static void multiplicar() {
        LeDados r = new LeDados();
        r.leValores();
        System.out.println("Multiplicação:" + (r.valor1 * r.valor2));
    }

}
