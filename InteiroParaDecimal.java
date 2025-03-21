import java.util.Scanner;

public class InteiroParaDecimal {
    public static void main(String [] args) {
        
        //inicialize as variáveis e a função própria do java, que converte decimal para binário em vice-versa
        Scanner scn = new Scanner (System.in);
        int dec = 0;
        String binaryString = Integer.toBinaryString(dec);

        //peça os dados ao usuario, faça a conversão e printe o resultado
        System.out.println("Escreva um número inteiro entre 0 e 255: ");
            dec = scn.nextInt();
            binaryString = Integer.toBinaryString(dec);
        System.out.println("Este número em binário é: " + binaryString );

    }
}
