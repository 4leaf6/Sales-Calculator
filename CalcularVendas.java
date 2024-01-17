import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class CalcularVendas {

	public static void main(String[] args) {

		List<Integer> base = new ArrayList<>();
        
		for (int i = 0; i < 6; i++) {
			int numero = ThreadLocalRandom.current().nextInt(0, 1000);
    		base.add(numero);
		}

	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("******   Some as vendas   ******");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");

		
		List<Integer> vendasRecentes = new ArrayList <>();

		for (int i = 1; i < 7; i++) {
			System.out.println("Digite venda " + i + ":");
			Scanner dado = new Scanner(System.in);			
 
			while ( dado.hasNext() ) {

   				if ( dado.hasNextInt()  ) {
				int vendas = dado.nextInt();

					if (vendas < 0 || vendas > 999) {
					System.out.println("Dado invalido. Tente novamente!");
					--i;
					break;

					} else {
					vendasRecentes.add(vendas);
					break;
     				}
				
				} else if ( dado.hasNextDouble() ) {
				double x = dado.nextDouble();
				System.out.println("Dado invalido. Tente novamente!");
				--i;
				break;
				
				} else {
				String s = dado.next();
				System.out.println("Dado invalido. Tente novamente!");
				--i;
				break;

     			}

			}
			}
		
		List<Integer> vendasTotais = new ArrayList <>();
		vendasTotais.addAll(base);
		vendasTotais.addAll(vendasRecentes);

		int total = 0;
		for (Integer i : vendasTotais) {
			total += i;
		}

	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("****** Resultado das vendas ******");
	System.out.println(" ");
	System.out.println("Vendas anteriores: " + base);
	System.out.println(" ");
	System.out.println("Vendas recentes: " + vendasRecentes);
	System.out.println(" ");
	System.out.println("Vendas totais: " + vendasTotais);
	System.out.println(" ");
	System.out.println("****** Total: " + total + " ******");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	}				
	

}