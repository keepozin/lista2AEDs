import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 1, aux, vezes = 0;
		// o primeiro n�mero da sequ�ncia � o 1
		
		
		System.out.println("Digite at� quando deseja a sequ�ncia: ");
		vezes = sc.nextInt(); //ir� pegar o valor e guardar para repeti��o.
			
			for (int i = 0; i < vezes; i++) //repetir� x vezes que a pessoa colocar.
			{
				System.out.println(num1); //imprimir� o 0, � o primeiro n�mero da sequ�ncia de fibonacci.
				aux = num1; // o auxiliar serve para os 2 primeiros numeros serem 1.
				num1 = num1 + num2; //soma o n�mero sucessor com o n�mero anterior.
				num2 = aux; 
			}
		
		sc.close();
	
	}
}
