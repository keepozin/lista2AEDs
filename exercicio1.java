import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource") //meu c�digo est� dando warning mesmo com o scanner fechado, ent�o coloquei essa SupressWarnings.
		Scanner sc = new Scanner(System.in);
		int i, num = 0, sequenciaValores = 0, valoresPositivos = 0, valoresNegativos = 0, zeros = 0;
		
		System.out.println("Quantos valores deseja inserir? ");
		num = sc.nextInt(); // guarda na mem�ria x vezes para repetir a entrada.
		
		for (i = 1; i <= num; i++) {
	        System.out.println("Digite os n�meros: ");
	        sequenciaValores = sc.nextInt(); //repete a entrada e guarda os valores na vari�vel sequenciaValores

	        if (sequenciaValores < 0) //confere se � menor que 0, se sim aumenta 1 na conta de valoresNegativos.
	        {  
	            valoresNegativos++;
	        } 
	        else if (sequenciaValores > 0) //confere se � menor que 0, se sim aumenta 1 na conta de valoresPositivos
	        {
	            valoresPositivos++;
	        } 
	        else //confere se � 0, se sim aumenta 1 na conta de zeros
	        {
	            zeros++; 
	        }
		}

		System.out.println("Positivos: " + valoresPositivos); 
	    System.out.println("Negativos: " + valoresNegativos);
	    System.out.println("Zeros: " + zeros); // mostra a quantidade de valores de cada vari�vel.
	    
	    sc.close();
	}
}


