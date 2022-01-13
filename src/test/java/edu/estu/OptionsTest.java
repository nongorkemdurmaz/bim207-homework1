package edu.estu;

import org.junit.Test;
import org.kohsuke.args4j.CmdLineException;

import static org.junit.Assert.*;

public class OptionsTest {
    @Test
    public void test1() throws CmdLineException {
        Options options = Main.parseArguments("sample1.txt", "sample2.txt", "-task", "NumOfTokens", "-r", "-u", "-u", "-topN", "15", "-start", "de");

        assertTrue(options.isReverseOrder());
        assertTrue(options.isUniqueValues());
        assertEquals("NumOfTokens", options.getTaskName());
        assertEquals(15, options.getTopN());
        assertEquals("de", options.getStart());
        assertArrayEquals(new String[]{"sample1.txt", "sample2.txt"}, options.getFiles().toArray());
    }

    @Test
    public void test2() throws CmdLineException {
        Options options = Main.parseArguments("-task", "FrequentTerms", "-r");

        assertTrue(options.isReverseOrder());
        assertFalse(options.isUniqueValues());
        assertEquals("FrequentTerms", options.getTaskName());
        assertEquals(5, options.getTopN());
        assertNull(options.getStart());
    }
}
