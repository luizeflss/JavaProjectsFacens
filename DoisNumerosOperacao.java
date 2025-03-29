import java.util.Scanner;

public class DoisNumerosOperacao {
    public static void main(String[] args){

        //inicialize as variaveis dos números, operador aritmético e resultado
        Scanner scn = new Scanner(System.in);
        double num1 = 0.0;
        double num2 = 0.0;
        double resultado = 0.0;
        int operador = 0;

        //colete os dados do usuario e armazene-os
        System.out.println("Digite o primeiro valor:");
        num1 = scn.nextDouble();
        System.out.println("Digite o segundo valor:");
        num2 = scn.nextDouble();
        System.out.println("Escolha uma das operações: \n1) + Soma \n2) - Subtração \n3) * Multiplicação \n4) / Divisão");
        operador = scn.nextInt();

        //diga ao algoritmo oque fazer com cada operador e armazene o resultado
        if(operador == 1) {
            resultado = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + resultado);
            } else if (operador == 2 ) {
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
            } else if (operador == 3 ) {
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
            } else if (operador == 4 ) {
                resultado = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + resultado);

        //caso o usuario tente fazer uma divisão por zero
        if (num1 == 0 || num2 == 0 && operador == 4) {
            System.out.println("Divisão por zero não permitida");
        }
        scn.close();
        }
    }
}
