import java.util.Scanner;

public class Fase1App {
	public static void main(String[] args) {
		
		String ciutat1;
		String ciutat2;
		String ciutat3;
		String ciutat4;
		String ciutat5;
		String ciutat6;
		
		Scanner ciutats = new Scanner(System.in);
		System.out.println("Introdueix sis ciutats: ");
		
		ciutat1 = ciutats.nextLine();
		ciutat2 = ciutats.nextLine();
		ciutat3 = ciutats.nextLine();
		ciutat4 = ciutats.nextLine();
		ciutat5 = ciutats.nextLine();
		ciutat6 = ciutats.nextLine();
		ciutats.close();
		
		System.out.println(ciutat1);
		System.out.println(ciutat2);
		System.out.println(ciutat3);
		System.out.println(ciutat4);
		System.out.println(ciutat5);
		System.out.println(ciutat6);
	}
}
	