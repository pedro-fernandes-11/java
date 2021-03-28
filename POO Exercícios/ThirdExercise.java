package package_lpoo_classes;
import java.util.Scanner;

public class ThirdExercise {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("String 1: ");
		String st_string = input.nextLine();
		System.out.print("String 2: ");
		String nd_string = input.nextLine();
		
		System.out.println("Tamanho de "+st_string+": "+st_string.length());
		System.out.println("Tamanho de "+nd_string+": "+nd_string.length());
		if(st_string.length()==nd_string.length()) {
			System.out.println("As duas strings são de tamanhos iguais");
		}else {
			System.out.println("As duas strings são de tamanhos diferentes");
		}
		if (st_string.equals(nd_string)) {
			System.out.println("As duas strings possuem conteúdo igual");
		}else {
			System.out.println("As duas strings possuem conteúdo diferente");
		}
	}
}
