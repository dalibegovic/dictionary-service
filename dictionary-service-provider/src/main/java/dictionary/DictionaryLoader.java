package dictionary;

import java.util.Iterator;
import java.util.ServiceLoader;

import dictionary.spi.Dictionary;

class DictionaryLoader {
    private ServiceLoader<Dictionary> loader;

    DictionaryLoader() {
        loader = ServiceLoader.load(Dictionary.class);
    }

    Iterator<Dictionary> getDictionaries() {
        return loader.iterator();
    }
}
