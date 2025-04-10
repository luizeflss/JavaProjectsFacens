import java.util.Scanner;

public class Teste{
    public static void main(String [] args){

        Scanner scn = new Scanner(System.in);
        double num = 0.0;

        System.out.println("Digite um número: ");
        num = scn.nextDouble();

        if(num > 0 ){
            System.out.println("É par");
        }else if (num < 0){
            System.out.println("É ímpar");
        }else {
            System.out.println("É zero");
        }

    }
}