import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Código dos Produtos: ");
		System.out.println("1. Alcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Diesel");
		System.out.println("4. Fim");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
				
		int produto = sc.nextInt();
		
		while (produto != 4) {
		
			if (produto == 1) {
				alcool += 1;
			}
			else if (produto == 2) {
				gasolina += 1;
			}
			else if (produto == 3) {
				diesel += 1;
			}
		produto = sc.nextInt();		
		}
		
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		
		sc.close();

	}

}
