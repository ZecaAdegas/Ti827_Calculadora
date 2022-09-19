package calculator;

public class Divide {

    public static void dividir() {
        LeDados r = new LeDados();
        r.leValores("Insira o dividendo: ", "Insira o divisor: ");
        System.out.println("Divisão:" + (r.valor1 / r.valor2));
    }

}
