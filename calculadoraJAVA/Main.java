package calculadoraJAVA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int resultado, n1, n2, opcao;
	    System.out.println("Bem vindo a calculadora");
	    System.out.println("-----------------------");
	    System.out.println("Digite um valor: ");
	    n1 = in.nextInt();
	    System.out.println("Digite outro valor: ");
	    n2 = in.nextInt();
	    System.out.println("escolha uma opcao: \n");
	    System.out.println("1 - soma \n");
	    System.out.println("2 - subtracao \n");
	    System.out.println("3 - multiplicacao \n");
	    System.out.println("4 - divisao\n");
	    opcao = in.nextInt();

	    switch (opcao) {
	     case 1:
	      resultado = n1 + n2;
	       System.out.println("a soma dos valores e: " + resultado);
	       break;
	     case 2:
	      resultado = n1 - n2;
	       System.out.println("a subtracao dos valores e: "+ resultado);
	       break;
	     case 3:
	       resultado = n1 * n2;
	       System.out.println("a multiplicacao dos valores e: "+ resultado);
	       break;
	     case 4:
	       resultado = n1 / n2;
	       System.out.println("a divisao dos valores e: "+ resultado);
	       break;
	     default:
	       System.out.println("Número inválido");
	    }

	}

}
