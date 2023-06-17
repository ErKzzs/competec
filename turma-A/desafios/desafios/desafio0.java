package desafios;
import java.util.Scanner;

public class desafio0 {
    public static void main(String[] args) {       
        Scanner scn = new Scanner (System.in);

        System.out.println("Digite um número:");
        int num = scn.nextInt();

            if (num % 2 == 0) {
                System.out.println("O número " + num + " é par!!!");
            }else {
                System.out.println("O número é impar");
            }

            scn.close();
    }
}
