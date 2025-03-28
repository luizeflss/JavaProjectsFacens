import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int idade = 0;

        System.out.println("Digite a idade: ");
        idade = scn.nextInt();

        if (idade >= 0 && idade <= 12)
            System.out.println("É uma criança");

        if (idade >= 13 && idade <= 17)
            System.out.println("É um adolescente");

        if (idade >= 18 && idade <= 64)
            System.out.println("É um adulto");

        if (idade >= 65)
            System.out.println("É um idoso");
    }
    
}
