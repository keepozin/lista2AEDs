import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N, base, num;
		double E = 0, fat = 1;
		
		System.out.println("Digite o valor de N!: ");
		N = sc.nextInt(); //pega o valor que ser� N (ultimo denominador)
		
		for (base = 0; base <= N; base++) //repete as fra��es at� N.
		{
			fat = 1;
			num = base;
			while (num > 1)
			{
				fat = (fat * num); 
				num--;
			}
			E = E + (1/fat);
		}
		
		System.out.println("O resultado � " + E); //mostra o resultado da conta
		sc.close();
	}

}
