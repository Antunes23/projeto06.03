package exercicio0603;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variável
		Double a, b, areatri;
		
		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);

		// Entrada de dados
		System.out.println("Digite base do seu triângulo");

		a = ler.nextDouble();

		// Entrada de dados
		System.out.println("Digite o valor da altura do triângulo");
		b = ler.nextDouble();

		// Processamento
		areatri = (a * b) / 2;

		System.out.println("A área do triângulo é de : " + areatri);
	}

}
