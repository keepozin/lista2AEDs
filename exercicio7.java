import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int voto = 1, cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, cinco = 0, seis = 0;
		
		while (voto != 0) // se for diferente de 0, o programa continuar� rodando at� que seja escolhido o 0.
		{
			
		System.out.println("Insira o seu voto, sabendo que: \r\n"
				+ "1,2,3,4 = voto para os respectivos candidatos; \r\n"
				+ "5 = voto nulo;  \r\n"
				+ "6 = voto em branco.");
	    voto = sc.nextInt(); //recebe o voto;
		
		
		System.out.println("pr�ximo voto, em caso de encerrar a sess�o selecione 0 para contabilizar");
			
			if (voto == 1)		// verifica as condi��es de CADA VOTO.
			{
				cand1 = cand1 +1;
			}
			if (voto == 2)
			{
				cand2 = cand2 +1;
			}
			if (voto == 3)
			{
				cand3 = cand3 +1;
			}
			if (voto == 4)
			{
				cand4 = cand4 + 1;
			}
			if (voto == 5)
			{
				cinco = cinco + 1;
			}
			if (voto == 6)
			{
				seis = seis + 1;
			}
			else // toda op��o que n�o for alguma citada acima, dar� como op��o inv�lida.
			{
				System.out.println("Op��o inv�lida, digite de 1 a 6.");
			}
		}
		System.out.println(cand1 + " votos para o candidato 1");
		System.out.println(cand2 + " votos para o candidato 2");
		System.out.println(cand2 + " votos para o candidato 3");
		System.out.println(cand4 + " votos para o candidato 4");
		System.out.println(cinco + " votos nulos");
		System.out.println(seis + " votos brancos");
	    
		sc.close();
	}

}
