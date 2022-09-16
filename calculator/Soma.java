package calculator;

public class Soma {

    public static void somar() {
        LeDados r = new LeDados();
        r.leValores();
        System.out.println("Soma:" + (r.valor1 + r.valor2));
    }

}
