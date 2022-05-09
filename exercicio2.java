import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource") //meu c�digo est� dando warning mesmo com o scanner fechado, ent�o coloquei essa SupressWarnings.
		Scanner sc = new Scanner(System.in);
		int i, num = 0, sequenciaValores = 0, valoresPositivos = 0, valoresNegativos = 0, zeros = 0, total;
		
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
		
		total = valoresPositivos + valoresNegativos + zeros; //total para a conta da porcentagem.
		
		System.out.println("Positivos: " + (valoresPositivos * 100/total + "%")); 
	    System.out.println("Negativos: " + (valoresNegativos * 100/total + "%"));
	    System.out.println("Zeros: " + (zeros * 100/total + "%")); //mostra a quantidade de n�meros em cada vari�vel em porcentagem
	    
	    sc.close();
	}
}


