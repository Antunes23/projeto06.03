package exercicio0603;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variável
		Double a,b,c,litrosgastos,custocombustivel;
		
		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println ("Qual o valor do combustivel?");
		a = ler.nextDouble ();
		
		//Entrada de dados
		System.out.println ("Quantos KM você percorreu hoje?");
		b = ler.nextDouble ();
		
		//Entrada de dados
		System.out.println ("Qual é o consumo médio do seu carro?");
		c = ler.nextDouble ();
		
		//Processamento
		litrosgastos = b/c;
		custocombustivel = litrosgastos * a;
		
		System.out.println ("Quantidade total de litros gastos no trajeto : " + litrosgastos);
		System.out.println ("Custo total com o combústivel : " + custocombustivel);
		
		

	}

}
