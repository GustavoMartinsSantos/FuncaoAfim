package Funcaoafim;

import java.util.Scanner;

public class FuncaoAfim {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Fun��o Afim:");
		
		System.out.print("Digite 1 para criar uma fun��o e 2 para calcular uma fun��o:");
		String option = input.next();
		
		double a = 0;
		double b = 0;
		double x;
		double y;
		
		while (option.equals("1")) {
			System.out.println("(OBS: o programa ir� calcular uma poss�vel fun��o para esses pontos)");
			System.out.print("Digite o  ponto (x,y): ");
			x = input.nextInt();
		
			while (x == 0) {
				System.out.print("x deve ser diferente de 0. Tente novamente:");
				x = input.nextInt();
			} // x deve ser diferente de 0 para o programa conseguir fazer a divis�o 
			  // e calcular o valor de a. Num / 0 == ?
			
			y = input.nextInt();
			System.out.println("(" + x + "," + y + ")"); 
			
			System.out.print("Digite o valor b:");
			b = input.nextInt();
			a = (y - b) / x;
		
			if (y == b) 
				System.out.println("y = " + b + " -> Fun��o constante");
			else if (a > 0 && b == 0)
				if (a == 1)
					System.out.println("y = x -> Fun��o identidade.");
				else 
					System.out.println("y = " + a + "x -> Fun��o linear crescente");
			else if (a < 0 && b == 0)
				System.out.println("y = " + a + "x -> Fun��o linear decrescente");
			else if (a > 0)
				System.out.println("y = " + a + "x + " + b + " -> Fun��o crescente");
			else if (a < 0)
				System.out.println("y = " + a + "x + " + b + " -> Fun��o decrescente");
			else
				System.out.println("N�o � fun��o.");
			
			System.out.print("Digite 1 para continuar calculando e 2 para usar essa fun��o: ");
			option = input.next();
		}
		
		while(option.equals("2")) {
			System.out.print("Digite o valor de x: ");
			x = input.nextInt();
			
			if (a == 0 && b == 0) {
				System.out.print("f(x) = ");
				a = input.nextInt();
				
				System.out.print("f(x) = " + a + "x + ");
				b = input.nextInt();
				
				System.out.println("f(x) = " + a + "x + " + b);
				
				System.out.println("f(x) = " + (a * x + b));
			} else 
				System.out.println("f(x) = " + (a * x + b));
			
			a = 0;
			b = 0;
			x = 0;
			// reinicializa��o das vari�veis
			
			main(null);
		} 
		
		System.out.println("Obrigado por usar o programa!!");
			
		input.close();
	}	
	
}