package loop;
import java.util.Scanner;
public class somas {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite um número : ");
		int v1 = scn.nextInt();
		int i = 1;
		int res = 0;

		while (i <= v1) {
			res += i;
			i++;
		}
		System.out.println(res);
		scn.close();
	}
}
