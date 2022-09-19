package calculator;

public class Soma {

    public static void somar() {
        LeDados r = new LeDados();
        r.leValores("Insira o primeiro valor: ", "Insira o segundo valor para somar: ");
        System.out.println("Soma:" + (r.valor1 + r.valor2));
    }

}
