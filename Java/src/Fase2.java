import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fase2 {
	public static void main(String[] args) {
				
		List <String> arrayCiutats = new ArrayList<>();
		
		String ciutat1 = "Barcelona";
		String ciutat2 = "Madrid";
		String ciutat3 = "Valencia";
		String ciutat4 = "Malaga";
		String ciutat5 = "Cadis";
		String ciutat6 = "Santander";
		
		arrayCiutats.addAll(Arrays.asList(ciutat1,ciutat2,ciutat3,ciutat4,ciutat5,ciutat6));
		Collections.sort(arrayCiutats);
		
		for(String ciutat : arrayCiutats) {
			System.out.println(ciutat);
		}
		
	}
}
