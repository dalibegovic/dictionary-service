package dictionary;

import java.util.SortedMap;
import java.util.TreeMap;

import dictionary.spi.Dictionary;

public class GeneralDictionary implements Dictionary {
    private SortedMap<String, String> dictionary;

    public GeneralDictionary() {
        dictionary = new TreeMap<>();
        dictionary.put("cloud", "a visible mass of condensed water vapor floating in the atmosphere, typically high " +
                "above the ground");
        dictionary.put("amazon", "a river in South America that flows more than 4,150 miles (6,683 km) through Peru, " +
                "Colombia, and Brazil into the Atlantic Ocean. It drains two-fifths of the continent and, in terms of" +
                " water-flow, is the largest river in the world.");
    }

    @Override
    public String getDefinition(String word) {
        return dictionary.get(word);
    }
}
