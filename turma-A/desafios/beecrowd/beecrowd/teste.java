package beecrowd;
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        boolean primo = false;
        while (primo == false) {
        int num = scn.nextInt();
        if (num == 2 || num == 5 || num == 7) {
            primo = true;
            break;
        }
            primo = (num%2==0 || num%5==0 || num%7==0) ? false:true;
            System.out.println(primo);
        }
    }
    
}
