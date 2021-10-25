import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		int quant = 5;
		int [] num = new int[quant];
		int soma = 0;
		int resmulti=0;
		int multiplicador = 0;
		
		for (int i = 0 ; i<quant; i++) {
			System.out.print("Digite o " + (i+1) + "° Numero : ");
			num [i] = input.nextInt();
			soma = soma + num [i]; 
			multiplicador = num [i];
			resmulti = resmulti + (multiplicador*num [i]);
		}
		System.out.println("----------");
		System.out.println("Soma : " + soma);
		System.out.println("Multiplicação : " + resmulti);
	}
}
