import java.util.Scanner;

public class InteiroParaDecimal {
    public static void main(String [] args) {
        Scanner scn = new Scanner (System.in);
        int dec = 0;
        String binaryString = Integer.toBinaryString(dec);

        System.out.println("Escreva um número inteiro entre 0 e 255: ");
            dec = scn.nextInt();
            binaryString = Integer.toBinaryString(dec);
            
        System.out.println("Este número em binário é: " + binaryString );

    }
}