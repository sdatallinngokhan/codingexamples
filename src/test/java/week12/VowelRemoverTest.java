package week12;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelRemoverTest {

    @Test
    public void shouldRemoveVowels() {
        // given
        VowelRemover vowelRemover = new VowelRemover();
        String input = "Coding is amazing. Do it also at home. Solve the tasks. Do not ignore them";
        String expected = "Cdng s mzng. D t ls t hm. Slv th tsks. D nt gnr thm";

        // when
        String actual = vowelRemover.removeVowels(input);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldHandleEmptyString(){
        // given
        VowelRemover vowelRemover = new VowelRemover();
        String input = "";
        String expected = "";

        // when
        String actual = vowelRemover.removeVowels(input);

        // then
        assertEquals(expected, actual);
    }

}