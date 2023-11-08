package atividadescanvas;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
        
		float salario,abono,resultado;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o salario: ");
		salario = leia.nextFloat();
		
		System.out.println("\nDigite o abono: ");
		abono = leia.nextFloat();
		
		resultado = (salario+abono);
		
		System.out.println("\nNovo salario: "+resultado);

	}

}
