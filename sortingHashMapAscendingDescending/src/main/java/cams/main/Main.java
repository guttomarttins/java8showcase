package cams.main;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

/**
 *
 * @author Carlos
 */
public class Main {

    public static void main(String[] args) {

        Map<String, Integer> budget = new HashMap<>();
        budget.put("Livros", 120);
        budget.put("Carros", 150);
        budget.put("Bicicletas", 100);
        budget.put("Passagens", 130);
        budget.put("Filmes", 1150);
        budget.put("Passeios", 90);
        System.out.println("map antes da ordenação: " + budget);

        Map<String, Integer> sorted = budget
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(toMap(e -> e.getKey(), 
                        e -> e.getValue(),
                        (e1, e2) -> e2,
                                LinkedHashMap::new));

        System.out.println("map depois da ordenação de valores: " + sorted);

        // above code can be cleaned a bit by using method reference
        sorted = budget
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

        // now let's sort the map in decreasing order of value
        sorted = budget
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

        System.out.println("map depois da orndenação de valores descendente: "
                + sorted);

    }
}
