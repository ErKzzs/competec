package beecrowd;
import java.util.Scanner;
public class numPrimo {
 
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        boolean primo = false;
        for(int i = 1; i <= N; i++) {
        while (primo == false) {
        int num = scn.nextInt();

        primo = (num%2==0 || num%5==0 || num%7==0) ? false:true;
        System.out.println("Prime");
        
        if (num == 2 || num == 5 || num == 7) {
            primo = true;
            break;
        }

        }
    }
    }
}