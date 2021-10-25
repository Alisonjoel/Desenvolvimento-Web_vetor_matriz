import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		
		int quant = 4;
		double[] nota = new double[quant];
		double media = 0;
		
		for (int i=0; i<quant ; i++) {
		System.out.println("informe a" +"  "+ (i+1) + "° nota"); 
		nota [i] = input.nextDouble();
		media = nota [i];
		}
		
		System.out.println("---------");
		
		System.out.println("Notas");
		for (int i=0; i<quant ; i++) {
		System.out.println(">" + nota [i]);
		}
		System.out.println("---------");
		System.out.print("Média"+" " + media);
		
		
		
}
}
