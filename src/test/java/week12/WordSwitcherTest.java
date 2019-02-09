package week12;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordSwitcherTest {

    @Test
    public void shouldSwitchWords() {
        // given
        WordSwitcher wordSwitcher = new WordSwitcher();
        List<String> lines = new LinkedList<>();
        lines.add("I am legend.");
        lines.add("I Robot.");
        String expectedLine1 = "legend. am I ";
        String expectedLine2 = "Robot. I ";

        // when
        List<String> result = wordSwitcher.switchWords(lines);

        // then
        assertEquals(expectedLine1, result.get(0));
        assertEquals(expectedLine2, result.get(1));
    }
}