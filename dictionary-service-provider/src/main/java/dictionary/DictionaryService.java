package dictionary;

import java.util.Iterator;
import java.util.Objects;
import java.util.ServiceConfigurationError;

import dictionary.spi.Dictionary;

public class DictionaryService {
    private DictionaryLoader dictionaryLoader;

    public DictionaryService() {
        dictionaryLoader = new DictionaryLoader();
    }

    public String getDefinition(String word) {
        String definition = null;

        try {
            Iterator<Dictionary> dictionaries = dictionaryLoader.getDictionaries();
            while (Objects.isNull(definition) && dictionaries.hasNext()) {
                Dictionary d = dictionaries.next();
                definition = d.getDefinition(word);
            }
        } catch (ServiceConfigurationError serviceError) {
            definition = null;
            serviceError.printStackTrace();
        }

        return definition;
    }
}
