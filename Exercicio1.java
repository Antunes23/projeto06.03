package exercicio0603;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variável
		double a,Celsius;
		
		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println ("Qual é a temperatura de hoje em Fahrenheit?");
		a = ler.nextDouble ();
		
		//Processamento
		Celsius = (a - 32)*5 / 9;
		
		System.out.println("A temperatura de hoje em graus Celsius é : " + Celsius);
		
		
		
		

	}

}
