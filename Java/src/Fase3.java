import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fase3 {
	public static void main(String[] args) {

		String ciutat1 = "Barcelona";
		String ciutat2 = "Madrid";
		String ciutat3 = "Valencia";
		String ciutat4 = "Malaga";
		String ciutat5 = "Cadis";
		String ciutat6 = "Santander";
		
		List<String> arrayCiutats            = new ArrayList<>();
		List<String> arrayCiutatsModificades = new ArrayList<>();

		arrayCiutats.addAll(Arrays.asList(ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6));
		
		for(String ciutat : arrayCiutats) {
			arrayCiutatsModificades.add(ciutat.replaceAll("a", "4"));
		}
		
		Collections.sort(arrayCiutatsModificades);
		System.out.print(arrayCiutatsModificades);
	}
}
