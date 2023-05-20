package desafios.loop;
import java.util.Scanner;
public class impares {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int cont = 1;
        while (cont < N) {
            if(cont % 2 == 1) System.out.println(cont);
            cont ++;
        }
        scn.close();
    }
}
