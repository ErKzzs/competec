package Aulas;
import java.util.Scanner;
public class Aula_01 {
    public static void main(String[] args) {
        
    Scanner scn = new Scanner(System.in);

    /* 
    Double abacaxi = 7.30;
    Double maca = 2.0;
    Double pera = 3.0;

    System.out.println("Digite quantos abacaxis você deseja :");
    abacaxi *= scn.nextInt();
    System.out.println("Digite quantas maçãs você deseja");
    maca *= scn.nextInt();
    System.out.println("Digite quantas peras você deseja");
    pera *= scn.nextInt();

    Double result = maca + abacaxi + pera;

    System.out.println("O valor total da compra é: " + result);

    scn.close();
    */

    // System.out.print("Digite o primeiro valor: ");
    // int v1 = scn.nextInt();
    // System.out.print("\nDigite o segundo valor: ");
    // int v2 = scn.nextInt();

    // if (v1 == v2) {

    //     System.out.println("Os valores são iguais");
    // }
    // else {

    //     System.out.print("Os valores não são iguais");
    // }

    // System.out.print("Digite sua idade: ");
    // int idade = scn.nextInt();

    // if (idade >= 18) {

    //     System.out.print("Eh maior de idade");
    // }
    // else {

    //     System.out.print("Eh menor de idade");
    // }

    // int x,y;

    // System.out.print("Digite a primeira idade: ");
    // x = scn.nextInt();
    // System.out.print("Digite a segunda idade: ");
    // y = scn.nextInt();

    // if (x == y) {

    //     System.out.println("As idades são as mesmas!!!");
    // }
    // else if (x > y) {

    //     System.out.println("A primiera idade " + x + " eh maior");
    // }
    // else {

    //     System.out.println("A segunda idade " + y + " eh maior");
    // }

    // Boolean chuva;
    // Boolean nublado;

    // System.out.print("Está chuvendo?");
    // chuva = scn.nextBoolean();
    // System.out.print("Está nublado?");
    // nublado = scn.nextBoolean();

    // if (chuva == true || nublado == true) {

    //     System.out.println("Está chovendo ou nublado");
    // }
    // else {

    //     System.out.print("Está ensolarado");
    // }

    // System.out.print("Está chovendo?");
    // Boolean chuva = scn.nextBoolean();
    // System.out.print("Eu trouxe guarda chuva?");
    // Boolean guarda = scn.nextBoolean();

    // if (chuva == true && guarda == true) {

    //     System.out.print("Eita como to dboa");
    // }
    // else if (chuva == true && guarda == false) {

    //     System.out.print("moio");
    // }
    // else {

    //     System.out.print("ta safe");
    // }

    // char opcao_menu = 'u';
    // switch (opcao_menu) {

    //     case 'u': 
    //     System.out.println("Up");
    //     break;
    
    //     case 'd':
    //     System.out.println("Down");
    //     break;
    // }

    // String opcao;
    // System.out.println("Qual operação você deseja fazer");
    // System.out.println("||| A - DEPOSITO \n||| B - SAQUE \n||| C - EMPRESTIMO");
    // opcao = scn.nextLine();

    // switch(opcao) {
    //     case "a":
    //         System.out.print("Você escolheu a opção Deposito");
    //         break;
    //     case "b":
    //         System.out.print("Você escolheu a opção Saque");
    //         break;
    //     case "c":
    //         System.out.print("Você escolheu a opção Emprestimo");
    //         break;
    // }

    int num;

    System.out.println("Digite um valor");
    num = scn.nextInt();

    if (num%3 == 0) {

        System.out.println("Verdadeiro");
    }
    else if (num%5 == 0) {

        System.out.println("Verdadeiro");
    }
    else {

        System.out.print("Falso");
    }

    




    scn.close();
}
}
