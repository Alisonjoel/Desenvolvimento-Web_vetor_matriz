import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		int quantal=2;
		int quantn=4;
		double[] nota = new double[quantn];
		double media = 0;
		int contal1 = 1;
		int contal2 = 1;

		for (int i=0; i<quantal ; i++) {
			System.out.println("--------------");
			System.out.println("Aluno : " + contal1);

			for (int i1=0; i1<quantn ; i1++) {
				System.out.print("informe a" +"  "+ (i1+1) + "° nota : "); 
				nota [i1] = input.nextDouble();
				media = nota [i1]; 
			}
			contal1 = contal1+1; 
		}

		for (int i=0; i<quantal ; i++) {
			System.out.println("--------------");
			System.out.println("Notas"+"  "+ contal2 +"  "+ "Aluno");
			for (int i2=0; i2<quantn ; i2++) {
				System.out.println("> " + nota [i2]);
			}
			contal2 = contal2+1;
		}


		/*for (int i1=0; i1<quantn ; i1++) {
				System.out.println("informe a" +"  "+ (i1+1) + "° nota"); 
				nota [i1] = input.nextDouble();
				media = nota [i1];
			}

			System.out.println("---------");

			System.out.println("Notas");
			for (int i1=0; i1<quantn ; i1++) {
				System.out.println(">" + nota [i1]);
			}
			System.out.println("---------");
			System.out.print("Média"+" " + media);
		 */


	}
}
