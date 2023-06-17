package beecrowd;
import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int meio = 0;

        int[] num = {0, 0, 0};
        
        for(int i = 0; i<=2; i++) {
            num[i] = scn.nextInt();
            menor = num[i];
        }

        for (int i = 0; i<=2; i++) {
            if(num[i] > maior){
                maior = num[i];
            }
            if(num[i] < menor) {
                menor = num[i];
            }
        } 
        for (int i = 0; i<=2; i++) {
            if(num[i]!=maior && num[i]!=menor) meio = num[i];
        }
        
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        System.out.println();
        System.out.println(maior);
        System.out.println(meio);
        System.out.println(menor);
    }
}