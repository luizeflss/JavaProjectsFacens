import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        double num1 = 0.0;
        double num2 = 0.0;
        int ope = 0;
        double resultado = 0.0;
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um número: \n");
        num1 = scn.nextDouble();
        System.out.println("Digite um número: \n");
        num2 = scn.nextDouble();

        System.out.println("Escolha a operação: \n 1)Soma \n 2)Subtração \n 3)Multiplicação \n 4)Divisão\n");
        ope = scn.nextInt();

        switch(ope){
            case 1:
                resultado = num1 + num2;
                System.out.println("\n"+ num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("\n"+ num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("\n"+ num1 + " * " + num2 + " = " + resultado);
                break;
            case 4:
                if(num1 == 0 || num2 == 0){
                    System.out.println("\nDivisão por zero não permitida.");
                }else{
                resultado = num1 / num2;
                System.out.println("\n"+ num1 + " : " + num2 + " = " + resultado);
                break;
                }
        scn.close();
        }
    }    
}
