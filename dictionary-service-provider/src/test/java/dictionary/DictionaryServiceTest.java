package dictionary;

import java.util.Iterator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import dictionary.spi.Dictionary;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DictionaryServiceTest {
    @InjectMocks
    private DictionaryService dictionaryService;

    @Mock
    private DictionaryLoader dictionaryLoader;

    @Mock
    private Dictionary dictionary;

    @Test
    void getDefinitionReturnsDefinitionIfWordIsPresent() {
        when(dictionary.getDefinition(anyString())).thenReturn("abc");
        Iterator dictionaryIterator = Mockito.mock(Iterator.class);
        when(dictionaryIterator.hasNext()).thenReturn(true);
        when(dictionaryIterator.next()).thenReturn(dictionary);
        when(dictionaryLoader.getDictionaries()).thenReturn(dictionaryIterator);

        String description = dictionaryService.getDefinition("random-word");

        assertFalse(description.isEmpty());
    }
}
