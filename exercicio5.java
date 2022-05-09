import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 1, aux, vezes = 0;
		// o primeiro número da sequência é o 1
		
		
		System.out.println("Digite até quando deseja a sequência: ");
		vezes = sc.nextInt(); //irá pegar o valor e guardar para repetição.
			
			for (int i = 1; i < vezes; i++) //começará no 1, para contar uma vez a menos.
			{
				System.out.println(num1); //imprimirá o 0, é o primeiro número da sequência de fibonacci.
				aux = num1; // o auxiliar serve para os 2 primeiros numeros serem 1.
				num1 = num1 + num2; //soma o número sucessor com o número anterior.
				num2 = aux; 
			}
		
		sc.close();
	
	}
}
