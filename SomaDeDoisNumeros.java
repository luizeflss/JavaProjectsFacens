import java.util.Scanner;

public class SomaDeDoisNumeros{
    public static void main(String [] args) {

        //defina uma variavel do tipo scanner e incialize as variaveis
        Scanner scn = new Scanner(System.in);
        int primeiroValor = 0;
        int segundoValor = 0;

        //escreva os inputs para o usuario entregar os dados
        System.out.println("Soma de dois numeros ");
        System.out.println("Digite o primeiro numero: ");
            primeiroValor = scn.nextInt();
        System.out.println("Digite o segundo numero: ");
            segundoValor = scn.nextInt();
        
        //crie uma variavel para o resultado e, faça a operação com os dados recebidos
        int soma = primeiroValor + segundoValor;
        System.out.println("O resultado da soma desses dois números é: " + soma);

    }
}