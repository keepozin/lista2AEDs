import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 1, aux, vezes = 0;
		// o primeiro número da sequência é o 1
		
		
		System.out.println("Digite até quando deseja a sequência: ");
		vezes = sc.nextInt(); //irá pegar o valor e guardar para repetição.
			
			for (int i = 0; i < vezes; i++) //repetirá x vezes que a pessoa colocar.
			{
				System.out.println(num1); //imprimirá o 0, é o primeiro número da sequência de fibonacci.
				aux = num1; // o auxiliar serve para os 2 primeiros numeros serem 1.
				num1 = num1 + num2; //soma o número sucessor com o número anterior.
				num2 = aux; 
			}
		
		sc.close();
	
	}
}
