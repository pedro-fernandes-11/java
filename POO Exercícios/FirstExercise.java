package package_lpoo_classes;
import java.util.Scanner;

public class FirstExercise {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qtde_eleitores = 15;
		int[] info = {0, 0, 0, 0, 0};
		String[] info_nomes = {"CandidatoA", "CandidatoB", "CandidatoC", "Voto Nulo", "Voto em Branco", "Percentagem Nulos", "Percentagem Brancos"};
		
		for(int i = 1;i <= qtde_eleitores;i++) {
			System.out.println(i+"° Voto: ");
			String voto = in.nextLine();
			
			for(int f = 0;f < 5;f++) {
				if (voto.equals(info_nomes[f])) {
					info[f]++;
				}
			}
		}
		double[] info_extra = {((info[3]*100)/(float)qtde_eleitores), ((info[4]*100)/(float)qtde_eleitores)};
		
		for(int i = 0; i < info_nomes.length;i++) {
			if (i >= 5) {
				System.out.printf("%s= %.2f%n", info_nomes[i], info_extra[i - 5]);
			}else {
				System.out.println(info_nomes[i]+": "+info[i]);
			}
		}
	}
}
