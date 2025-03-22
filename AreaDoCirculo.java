import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
            int raio = 0;
            double pi = 3.14;
            double resultado = pi * (raio*raio);

        System.out.println("Digite o valor do raio: ");
            raio = scn.nextInt();
            resultado = pi * (raio*raio);

        System.out.println("O valor da circunferencia é: " + resultado);  

    }
}
