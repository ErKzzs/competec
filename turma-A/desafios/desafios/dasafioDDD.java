package desafios;
import java.util.Scanner;

public class dasafioDDD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int cont = 0;

        while (cont == 0){
        
        System.out.print("Digite o DDD a ser pesquisado : ");
        int DDD = scn.nextInt();

        switch (DDD) {

            // Cidades Sudeste
            case 11, 12, 13, 14, 15, 16, 17, 18, 19:
            System.out.println("A cidade correponde é São Paulo MANO");
            System.out.println();
            break;
        
            case 21, 22, 24:
            System.out.println("A cidade correspondente é Rio de Janeiro manééé");
            System.out.println();
            break;

            case 31, 32, 33, 34, 35, 37, 38:
            System.out.println("A cidade correpondente é Minas Gerais paozin de queijo");
            System.out.println();
            break;

            case 27, 28:
            System.out.println("A cidade correpondente é Espírito Santo TA POCANDOO");
            System.out.println();
            break;

            // Cidades do Sul
            case 51, 53, 54, 55:
            System.out.println("A cidade correpondente é Rio Grande do Sul Bahhhhhh nehhh");
            System.out.println();
            break;

            case 41, 42, 43, 44, 45, 46:
            System.out.println("A cidade correpondente é Paraná ta de caô piá");
            System.out.println();
            break;

            case 47, 48, 49:
            System.out.println("A cidade correpondente é Santa Catarina, é chimas nehhh arhamm");
            System.out.println();
            break;

            // Cidades do Norte

            case 68:
            System.out.println("Um dino me contou que a cidade é Acre");
            System.out.println();
            break;

            case 96:
            System.out.println("A cidade correpondente é Amapá Ééééééééguaaaa");
            System.out.println();
            break;

            case 92, 97:
            System.out.println("A cidade correpondente é Amazonas, é de capar o gato");
            System.out.println();
            break;

            case 91, 93, 94:
            System.out.println("A cidade correpondente é Pará, eitaaa zuada");
            System.out.println();
            break;

            case 69:
            System.out.println("A cidade correpondente é Rondônia");
            System.out.println();
            break;

            case 95:
            System.out.println("A cidade correpondente é Roraima");
            System.out.println();
            break;

            // Cidades do Nordeste

            case 71, 73, 74, 75, 77:
            System.out.println("A cidade correpondente é Bahia La eeeeele");
            System.out.println();
            break;

            case 85, 88:
            System.out.println("A cidade correpondente é Ceará Oxeeente!!!");
            System.out.println();
            break;

            default:
            System.out.println("DDD inválido");
            System.out.println();
            break;

        }
    }

        scn.close();
    }
}