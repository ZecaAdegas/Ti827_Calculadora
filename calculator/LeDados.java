package calculator;

public class LeDados {
    public float valor1, valor2;

    public void leValores(String s1, String s2) {
        System.out.println(s1);
        valor1 = calculator.ler.nextFloat();
        System.out.println(s2);
        valor2 = calculator.ler.nextFloat();
    }
}
