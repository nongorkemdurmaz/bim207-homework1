package edu.estu;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NumOfTokensTaskTest {
    @Test
    public void test1() throws IOException {
        List<String> sample1Tokens = TokenProcessor.readFile("sample1.txt");
        List<String> sample2Tokens = TokenProcessor.readFile("sample2.txt");
        List<String> sample3Tokens = TokenProcessor.readFile("sample3.txt");
        List<String> mergeTokens = TokenProcessor.mergeLists(sample1Tokens, sample2Tokens, sample3Tokens);
        assertEquals(761, mergeTokens.size());
    }
}
