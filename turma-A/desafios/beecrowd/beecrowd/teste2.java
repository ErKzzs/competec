package beecrowd;
import java.util.Scanner;
public class teste2 {

 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        int maior = n1;
        int meio = n2;
        int menor = n3;
        
        if (n2 > n1) {
            maior = n2;
        }
        else if (n3 > n1) {
            maior = n3;
        }
        else if (n1 < n3){
            menor = n1;
        }
        else if (n2 < n3) {
            menor = n2;
        }
        else if (n1 < maior && n1 > menor) {
            meio = n1;
        }
        else if (n2 < maior && n2 > menor) {
            meio = n2;
        }
        else if (n3 < maior && n3 > menor) {
            meio = n3;
        }
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
 
    }
}
