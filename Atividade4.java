package atividadescanvas;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
      
		float n1,n2,n3,n4,diferença;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nNumero 1: ");
	    n1 = leia.nextFloat();
		
		System.out.println("\nNumero 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nNumero 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("\nNumero 4: ");
		n4 = leia.nextFloat();
		
		diferença = (n1*n2)-(n3*n4);
		
		System.out.println("\nDiferença: "+diferença);

	}

}
