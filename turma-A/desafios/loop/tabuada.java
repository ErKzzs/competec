package desafios.loop;
import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {    
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite um núemro : ");
        int num = scn.nextInt();
        for (int cont = 1; cont <= 10; cont++){
            System.out.println(num + " x " + cont + " = " + (cont * num));
        }
        scn.close();
    }
}
