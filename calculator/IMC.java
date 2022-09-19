package calculator;

public class IMC {

    public static void calculaIMC() {
        float resultado;
        LeDados r = new LeDados();
        r.leValores("Insira o peso: ", "Insira a altura: ");
        resultado = (r.valor1 / (r.valor2*r.valor2));
        System.out.println("IMC:" + resultado);
        if (resultado < 18.5)
            System.out.println("Abaixo do Peso recomendado");
        else if (resultado <= 24.9)
            System.out.println("Peso normal");
        else if (resultado <= 29.9)
            System.out.println("Sobrepeso");
        else if (resultado <= 34.9)
            System.out.println("Obesidade Grau I");
        else if (resultado <= 39.9)
            System.out.println("Obesidade Grau II");
        else
            System.out.println("Obesidade Grau III ou Mórbida");
    }
}
