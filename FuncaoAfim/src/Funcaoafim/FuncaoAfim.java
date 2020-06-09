package Funcaoafim;

import java.util.Scanner;

public class FuncaoAfim {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Função Afim:");
		
		System.out.print("Digite 1 para criar uma função e 2 para calcular uma função:");
		String option = input.next();
		
		double a = 0;
		double b = 0;
		double x;
		double y;
		
		while (option.equals("1")) {
			System.out.println("(OBS: o programa irá calcular uma possível função para esses pontos)");
			System.out.print("Digite o  ponto (x,y): ");
			x = input.nextInt();
		
			while (x == 0) {
				System.out.print("x deve ser diferente de 0. Tente novamente:");
				x = input.nextInt();
			} // x deve ser diferente de 0 para o programa conseguir fazer a divisão 
			  // e calcular o valor de a. Num / 0 == ?
			
			y = input.nextInt();
			System.out.println("(" + x + "," + y + ")"); 
			
			System.out.print("Digite o valor b:");
			b = input.nextInt();
			a = (y - b) / x;
		
			if (y == b) 
				System.out.println("y = " + b + " -> Função constante");
			else if (a > 0 && b == 0)
				if (a == 1)
					System.out.println("y = x -> Função identidade.");
				else 
					System.out.println("y = " + a + "x -> Função linear crescente");
			else if (a < 0 && b == 0)
				System.out.println("y = " + a + "x -> Função linear decrescente");
			else if (a > 0)
				System.out.println("y = " + a + "x + " + b + " -> Função crescente");
			else if (a < 0)
				System.out.println("y = " + a + "x + " + b + " -> Função decrescente");
			else
				System.out.println("Não é função.");
			
			System.out.print("Digite 1 para continuar calculando e 2 para usar essa função: ");
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
			// reinicialização das variáveis
			
			main(null);
		} 
		
		System.out.println("Obrigado por usar o programa!!");
			
		input.close();
	}	
	
}