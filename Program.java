package PTI;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de X");
		int x = sc.nextInt();
		System.out.println("Informe o valor de Y");
		int y = sc.nextInt();
		Ponto p1 = new Ponto();
		System.out.println("A distancia entre eles: " + p1.distancia(x, y) + p1.igual(x, y, p1));				
		sc.close();
		
	}
}
