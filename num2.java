import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		
		int quant = 10;
		double[] num = new double[quant];
		
		for (int i=0; i<quant ; i++) {
		System.out.println("informe o" +"  "+ (i+1) + "° numero"); 
		num [i] = input.nextDouble();
		}
		
		System.out.println("---------");
		
		
		for (int i = quant-1; i>=0 ; i--) {
		System.out.println(">" + num [i]);
		}
		
}
}
