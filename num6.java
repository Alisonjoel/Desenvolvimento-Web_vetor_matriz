import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		int quant = 20;
		int [] num = new int[quant];
		int [] par = new int[quant];
		int [] impar = new int[quant];

		for (int i = 0 ; i<quant; i++) {
			System.out.println("Digite o " + (i+1) + "° Numero");

			if (num[i] % 2 == 0){

			par[i] = (par[i]+num[i]);	

			}


			System.out.println("");

		}
	}
}
