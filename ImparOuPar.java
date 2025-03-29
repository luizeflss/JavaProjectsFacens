import java.util.Scanner;
public class ImparOuPar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scn.nextInt();
        boolean par = num % 2 == 0;
        boolean parrange = num >= 10 && num <= 50;
        boolean imparrange = num >= 11 && num <= 51;

        if (par) {
            System.out.println("O número é par.");
            if (parrange)
                System.out.println("dentro do range");
            else
                System.out.println("fora do range");
        }else{
            System.out.println("O número é ímpar.");
            if (imparrange)
            System.out.println("dentro do range");
        else
            System.out.println("fora do range");
        }
    }
}
