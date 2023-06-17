package desafios;
import java.util.Scanner;
public class coordenadas {
    public static void main (String args []) {
        //Declarando as variáveis e criando o Scanner
        Scanner scn = new Scanner(System.in);
        int coord = 6;

        //Início do looping
        while (coord!=0){
        //Entrada da orientação
        System.out.println("Digite a orientação a ser dada : \n1 - Direita\n2 - Esquerda\n3 - Viaduto\n4 - Espere o sinal\n5 - Ir reto\n0 - Parar o programa\n");
        coord = scn.nextInt();
        //Estrutura condicional
        if (coord == 1) {
            System.out.println("\nVá para a direita                  Pra já!\n");
        }else if (coord == 2) {
            System.out.println("\nEsquerda, agora                    Esquerdei, e agora?\n");
        }else if (coord == 3) {
            System.out.println("\nPasse para o Viaduto da frente agora                    Eita pipoco. Zumm!\n");
        }else if (coord == 4) {
            System.out.println("\nEspere o sinal                     Ok!\n");
        }else if (coord == 5) {
            System.out.println("\nContinue indo reto                Pronto e agora, e agora?\n");
        }else if (coord >5) {
            System.out.println("Valor inválido, digite novamente!!!");
        }
        }

        scn.close();
    }
}