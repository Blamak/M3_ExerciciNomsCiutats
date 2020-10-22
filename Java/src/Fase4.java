import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fase4 {
	public static void main(String[] args) {

		String ciutat1 = "Barcelona";
		String ciutat2 = "Madrid";
		String ciutat3 = "Valencia";
		String ciutat4 = "Malaga";
		String ciutat5 = "Cadis";
		String ciutat6 = "Santander";

		List <String> arrayCiutats = new ArrayList<>();
		arrayCiutats.addAll(Arrays.asList(ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6));
		
		List <Character> arrayCiutat1 = new ArrayList<>();
		List <Character> arrayCiutat2 = new ArrayList<>();
		List <Character> arrayCiutat3 = new ArrayList<>();
		List <Character> arrayCiutat4 = new ArrayList<>();
		List <Character> arrayCiutat5 = new ArrayList<>();
		List <Character> arrayCiutat6 = new ArrayList<>();

		// Array bidimensional que contindrà els arrays per cada ciutat:
		List <List <Character> > array2dimensions = new ArrayList<List <Character> >();
		array2dimensions.addAll(
				Arrays.asList(arrayCiutat1, arrayCiutat2, arrayCiutat3, arrayCiutat4, arrayCiutat5, arrayCiutat6));

		// Recórrer l'array que conté els noms de les ciutats.
		for (int i = 0; i < arrayCiutats.size(); i++) {
			String nomCiutat = arrayCiutats.get(i);

			// Amb cada nom de ciutat omplir els arrays del bidimensional, lletra per lletra.
			for (char lletra : nomCiutat.toCharArray()) {
				array2dimensions.get(i).add(lletra);
			}
		}
		
		for(List <Character> arrayCiutat : array2dimensions) {
			Collections.reverse(arrayCiutat);
			System.out.println(arrayCiutat);
		}
		
	}

}
