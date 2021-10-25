import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		
		int quant = 5;
		double[] num = new double[quant];
		
		for (int i=0; i<quant ; i++) {
		System.out.println("informe o" +"  "+ (i+1) + "° numero"); 
		num [i] = input.nextDouble();
		}
		
		System.out.println("---------");
		
		for (int i=0; i<quant ; i++) {
		System.out.println(">" + num [i]);
		}
		
}
}
