public class SanduicheJava {
    public static void main(String args[]){
        System.out.println("""
                        PÃO COM MANTEIGA NA CHAPA\r 
                        RECURSOS:\r 
                        pão de sal\r 
                        pote de manteiga\r 
                        frigideira\r 
                        faca de manteiga\r 
                        prato\r 
                        fogão \r 
                        \r 
                        PASSOS:\r 
                        --------feedback---------Verifique se o gás está ligado\r 
                        1-Acenda uma das bocas de 'fogão'\r 
                        2-Pegue 'frigideira' e coloque em *boca acesa* de 'fogão'\r 
                        3-Com sua mão dominante pegue 'faca de manteiga' pelo cabo\r 
                        4-Com a sua mão não dominante pegue 'pão de sal'\r 
                        5-Faça um corte em 'pão de sal' com 'faca de manteiga' de forma que separe 'pão de sal' em duas partes\r 
                        6-Defina 'parte 1' e 'parte 2', onde cada uma dessas duas partes possuem dois lados: *miolo* e *casca*\r 
                        \r 
                        --------feedback---------Pegue um 'prato'\r 
                        \r 
                        7-Reserve as duas partes em 'prato'\r 
                        \r 
                        --------feedback---------Pegue um 'pote de manteiga'\r 
                        \r 
                        8-Abra 'pote de manteiga'\r 
                        \r 
                        9-Processo de untar:\r 
                        { -Pegue 'parte 1' com sua mão não dominante\r 
                          -Use 'faca de manteiga' para retirar manteiga de 'pote de manteiga' \r 
                          -Unte o lado *miolo* de 'parte 1' com 'faca de manteiga' até que todo o *miolo* tenha sido preenchido com manteiga de modo uniforme \r 
                          -Reserve 'parte 1' em 'prato'}\r 
                        \r 
                        10-Em 'Processo de untar' substitua 'parte 1' por 'parte 2'\r 
                        11-Repita passo 9\r 
                        \r 
                        12-Reserve 'faca de manteiga' em 'pote de manteiga'\r 
                        \r 
                        13-Verificar 'frigideira':\r 
                        14\t-Se *esquentou* :\r\n
                        15\t\t-Pegue 'parte 1' de 'prato' e coloque com *miolo* virado para *dentro* de 'frigideira'\r 
                        16\t\t\t-Verificar 'parte 1':\r 
                        17\t\t\t\t-Se *não dourou* :\r 
                        18\t\t\t\t\t-repita passo 16\r 
                        19\t\t\t\t-Se *dourou* : \r 
                        20\t\t\t\t\t-Reserve 'parte 1' em 'prato'\t\r\n
                        21\t\t-Pegue 'parte 2' de 'prato' e coloque com *miolo* virado para *dentro* de 'frigideira'\r 
                        22\t\t\t-Verificar 'parte 2':\r 
                        23\t\t\t\t-Se *não dourou* :\r 
                        24\t\t\t\t\t-repita passo 22\r 
                        25\t\t\t\t-Se *dourou* : \r 
                        26\t\t\t\t\t-Reserve 'parte 2' em 'prato'\r\n
                        27\t-Se *não esquentou* :\r 
                        28\t\t-repita passo 13\r 
                        \r 
                        29-Apagar *boca acesa* de 'fogão'
                                """);
    }    
}
