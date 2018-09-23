package dictionary;

import java.util.Objects;

import org.junit.jupiter.api.Test;

import dictionary.spi.Dictionary;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GeneralDictionaryTest {
    private Dictionary generalDictionary = new GeneralDictionary();

    @Test
    void getDefinitionReturnsDefinitionIfWordIsPresent() {
        String word = "cloud";

        String description = generalDictionary.getDefinition(word);

        assertFalse(description.isEmpty());
    }

    @Test
    void getDefinitionReturnsNullIfWordIsNotPresent() {
        String word = "kgnthfstsfsfze";

        String description = generalDictionary.getDefinition(word);

        assertTrue(Objects.isNull(description));
    }
}
