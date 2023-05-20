package desafios.loop;

public class soma1_100 {
    public static void main(String[] args) {
        
        int soma = 0;
        int cont = 1;

        while (cont < 101) {

            soma += cont;
            cont ++;
            System.out.println("A soma atual é : " + soma);
        }

        System.out.println("A soma final é : " + soma);
    }
}
