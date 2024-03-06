package exercicio0603;
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variável
		int soma,divi,multi,sub,a,b;
		
		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println("Digite um número");
		a = ler.nextInt ();
		
		//Entrada de dados
		System.out.println("Digite outro número");
		b = ler.nextInt();
		
		//Processamento
		soma = a + b;
		divi = a / b;
		multi = a * b;
		sub = a - b;
		
		System.out.println("O resultado da soma é : " + soma);
		System.out.println("O resultado da divisão é : " + divi);
		System.out.println("O resultado da multiplicação é : " + multi);
		System.out.println("O resultado da subtração é : " + sub);

	}

}
