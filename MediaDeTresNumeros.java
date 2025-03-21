import java.text.DecimalFormat;

public class MediaDeTresNumeros {
        public static void main(String [] args) {
            DecimalFormat deci = new DecimalFormat("0.00");
            double numeros = 5 + 9.6 + 6.7;
            double media = numeros/3;
            System.out.println(deci.format(media));
        }
    
}
