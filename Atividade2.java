package atividadescanvas;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
      
		float n1,n2,n3,n4,media;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a Nota 1: ");
	    n1 = leia.nextFloat();
		
		System.out.println("\nDigite a Nota 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nDigite a Nota 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("\nDigite a Nota 4: ");
		n4 = leia.nextFloat();
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("\nMedia final: "+media);

	}

}
