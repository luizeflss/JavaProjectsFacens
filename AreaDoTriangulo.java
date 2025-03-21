import java.util.Scanner;

public class AreaDoTriangulo {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
            int base = 0;
            int altura = 0;
            int area = (base*altura) / 2;
    
        System.out.println("Digite o valor da base: ");
            base = scn.nextInt();
        System.out.println("Digite o valor da altura: ");
            altura = scn.nextInt();

        area = (base*altura) / 2;
        System.out.println("O valor da area é de: " + area);

    }
}
