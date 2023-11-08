package atividadescanvas;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
       
		float salariobruto,adicionalnoturno,horasextras,desconto,SalarioLiquido;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nSalario bruto: ");
	    salariobruto = leia.nextFloat();
		
		System.out.println("\nAdicional noturno: ");
		adicionalnoturno = leia.nextFloat();
		
		System.out.println("\nHoras extras: ");
		horasextras = leia.nextFloat();
		
		System.out.println("\nDesconto: ");
		desconto = leia.nextFloat();
		
		SalarioLiquido = (salariobruto+adicionalnoturno+(horasextras*5)-desconto);
		
		System.out.println("\nMedia final: "+SalarioLiquido);

	}

}
