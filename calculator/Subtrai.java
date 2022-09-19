package calculator;

public class Subtrai {

    public static void subtrair() {
        LeDados r = new LeDados();
        r.leValores("Insira o primeiro valor: ", "Insira o segundo valor para subtrair: ");
        System.out.println("Subtração:" + (r.valor1 - r.valor2));
    }

}
