package exercicio0603;
import java.util.Scanner;
public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variável
		double dolar,euro,a;
		
		//Instaciar classe Scanner
        Scanner ler = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println("Digite um valor em reias para ser convertido em dólar e em euros");
		a = ler.nextDouble();
		
		//Processamento
		dolar = a * 4.94;
		euro = a * 5.38;
		
	  	System.out.println("Seu valor em Dólar é : " + dolar);
		System.out.println("Seu valor em Euro é : " + euro);
		

	}

}
