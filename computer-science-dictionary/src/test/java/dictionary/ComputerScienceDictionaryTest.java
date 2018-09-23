package dictionary;

import java.util.Objects;

import org.junit.jupiter.api.Test;

import dictionary.spi.Dictionary;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ComputerScienceDictionaryTest {
    private Dictionary computerScienceDictionary = new ComputerScienceDictionary();

    @Test
    void getDefinitionReturnsDefinitionIfWordIsPresent() {
        String word = "rest";

        String description = computerScienceDictionary.getDefinition(word);

        assertFalse(description.isEmpty());
    }

    @Test
    void getDefinitionReturnsNullIfWordIsNotPresent() {
        String word = "kgnthfstsfsfze";

        String description = computerScienceDictionary.getDefinition(word);

        assertTrue(Objects.isNull(description));
    }
}
