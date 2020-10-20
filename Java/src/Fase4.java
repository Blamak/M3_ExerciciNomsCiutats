import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fase4 {
	public static void main(String[] args) {

		String ciutat1 = "Barcelona";
		String ciutat2 = "Madrid";
		String ciutat3 = "Valencia";
		String ciutat4 = "Malaga";
		String ciutat5 = "Cadis";
		String ciutat6 = "Santander";

		List<String> arrayCiutats = new ArrayList<>();
		arrayCiutats.addAll(Arrays.asList(ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6));

		List<Character> arrayCiutat1 = new ArrayList<>();
		List<Character> arrayCiutat2 = new ArrayList<>();
		List<Character> arrayCiutat3 = new ArrayList<>();
		List<Character> arrayCiutat4 = new ArrayList<>();
		List<Character> arrayCiutat5 = new ArrayList<>();
		List<Character> arrayCiutat6 = new ArrayList<>();

//		Array bidimensional que contindrà els arrays per cada ciutat:
		List<List<Character>> array2dimensions = new ArrayList<List<Character>>();
		array2dimensions.addAll(
				Arrays.asList(arrayCiutat1, arrayCiutat2, arrayCiutat3, arrayCiutat4, arrayCiutat5, arrayCiutat6));

		for (int i = 0; i < arrayCiutats.size(); i++) {
			String nomCiutat = arrayCiutats.get(i);

			for (char lletra : nomCiutat.toCharArray()) {
				array2dimensions.get(i).add(lletra);
			}
		}

		System.out.println("Array bidimensional: " + array2dimensions);
		System.out.println("L'array " + array2dimensions.get(0) + " té una mida de: " + array2dimensions.get(0).size());
		System.out.println("L'array " + array2dimensions.get(1) + " té una mida de: " + array2dimensions.get(1).size());
		System.out.println("L'array " + array2dimensions.get(2) + " té una mida de: " + array2dimensions.get(2).size());
		System.out.println("L'array " + array2dimensions.get(3) + " té una mida de: " + array2dimensions.get(3).size());
		System.out.println("L'array " + array2dimensions.get(4) + " té una mida de: " + array2dimensions.get(4).size());
		System.out.println("L'array " + array2dimensions.get(5) + " té una mida de: " + array2dimensions.get(5).size());

	}

}
