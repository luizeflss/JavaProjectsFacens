import java.util.Scanner;

public class AC1 {
    public static void main(String[] args) {
        //inicialize as variaveis
        Scanner scn = new Scanner(System.in);
        double ac1 = 0.0;
        double ac2 = 0.0;
        double ag = 0.0;
        double af = 0.0;
        double notaminima = 0.0;

        //receba as notas do usuario
        System.out.println("Digite sua nota na AC1: ");
        ac1 = scn.nextDouble();
        System.out.println("Digite sua nota na AC2: ");
        ac2 = scn.nextDouble();
        System.out.println("Digite sua nota na AG: ");
        ag = scn.nextDouble();
        System.out.println("Digite sua nota na AF: ");
        af = scn.nextDouble();

        //receba a nota minima para aprovacao
        System.out.println("Digite a nota mínima para aprovação: ");
        notaminima = scn.nextDouble();

        //calcule a media final
        double mediafinal = (ac1 * 0.15) + (ac2 *0.30) + (ag * 0.10) + (af * 0.45);

        //mostre as notas de cada avaliacao
        System.out.println("AC1: " + ac1);
        System.out.println("AC2: " + ac2);
        System.out.println("AG: " + ag);
        System.out.println("AF: " + af);

        //mostre a media final
        System.out.println("Sua média final é: " + mediafinal);

        //mostre se foi aprovado ou nao
        if(mediafinal >= notaminima){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
        
        //feche o scanner
        scn.close();
    }
}
