package dictionary;

import java.util.SortedMap;
import java.util.TreeMap;

import dictionary.spi.Dictionary;

public class ComputerScienceDictionary implements Dictionary {
    private SortedMap<String, String> dictionary;

    public ComputerScienceDictionary() {
        dictionary = new TreeMap<>();
        dictionary.put("rest", "Representational State Transfer (REST) is an architectural style that defines a set " +
                "of constraints to be used for creating web services");
        dictionary.put("xml", "XML is a software- and hardware-independent tool for storing and transporting data.");
    }

    @Override
    public String getDefinition(String word) {
        return dictionary.get(word);
    }
}
