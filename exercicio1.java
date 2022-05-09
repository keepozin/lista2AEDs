import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource") //meu código está dando warning mesmo com o scanner fechado, então coloquei essa SupressWarnings.
		Scanner sc = new Scanner(System.in);
		int i, num = 0, sequenciaValores = 0, valoresPositivos = 0, valoresNegativos = 0, zeros = 0;
		
		System.out.println("Quantos valores deseja inserir? ");
		num = sc.nextInt(); // guarda na memória x vezes para repetir a entrada.
		
		for (i = 1; i <= num; i++) {
	        System.out.println("Digite os números: ");
	        sequenciaValores = sc.nextInt(); //repete a entrada e guarda os valores na variável sequenciaValores

	        if (sequenciaValores < 0) //confere se é menor que 0, se sim aumenta 1 na conta de valoresNegativos.
	        {  
	            valoresNegativos++;
	        } 
	        else if (sequenciaValores > 0) //confere se é menor que 0, se sim aumenta 1 na conta de valoresPositivos
	        {
	            valoresPositivos++;
	        } 
	        else //confere se é 0, se sim aumenta 1 na conta de zeros
	        {
	            zeros++; 
	        }
		}

		System.out.println("Positivos: " + valoresPositivos); 
	    System.out.println("Negativos: " + valoresNegativos);
	    System.out.println("Zeros: " + zeros); // mostra a quantidade de valores de cada variável.
	    
	    sc.close();
	}
}


