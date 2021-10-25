import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		int quant = 10;
		String [] caract = new String[quant];
		int cons = 0;
		int vogal = 0;

		for (int i=0; i<quant ; i++) {
			System.out.print("informe uma letra : "); 
			caract [i] = input.next();
		}
		System.out.println("--------------");
		System.out.println("Consoantes informadas : ");
		for (int i =0; i<quant; i++) {
			
			if (caract [i].equals("a")||(caract [i].equals("e"))||(caract [i].equals("i"))||(caract [i].equals("o"))||(caract [i].equals("u"))) {
			vogal = (vogal+1);
			
			} else {
			cons= cons+1;
			System.out.println(caract [i]);	
		}
		}
		System.out.println("---------------------");
		System.out.println("Quantidade de Consoantes  " + cons);
		
}
}
