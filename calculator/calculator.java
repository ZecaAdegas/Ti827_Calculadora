package calculator;

import java.util.Scanner;

public class calculator {

    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        char op;
        do{
            System.out.println("--- MENU CALCULADORA ---");
            System.out.println("+ -> Soma");
            System.out.println("- -> Subtração");
            System.out.println("* -> Multiplicação");
            System.out.println("/ -> Divisão");
            System.out.println("e -> Expoente");
            System.out.println("i -> IMC");
            System.out.println("s -> Sair");
            System.out.println("Selecione o operadora da opção pretendida:");
            op = ler.next().charAt(0);
            switch (op) {
                case 'S': break;
                case 's': break;
                case '+': Soma.somar(); break; 
                case '-': Subtrai.subtrair(); break;
                case '*': Multiplica.multiplicar(); break;
                case '/': Divide.dividir(); break;
                case 'i': IMC.calculaIMC(); break;
                case 'I': IMC.calculaIMC(); break;
                case 'E': Expoente.potencia(); break;
                case 'e': Expoente.potencia(); break;                   
                default: System.out.println("Operador incorreto"); break;
            }
        } while (op != 's' && op != 'S');
    }
}