package edu.estu;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class TokenProcessor {
    public static List<String> readFile(String fileName) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        StringTokenizer tokenizer = new StringTokenizer(content);
        List<String> tokens = new LinkedList<>();
        while (tokenizer.hasMoreTokens()) {
            String token = removeNotLetterOrDigits(tokenizer.nextToken().toLowerCase());
            if (!token.isEmpty()) {
                tokens.add(token);
            }
        }
        return tokens;
    }

    private static String removeNotLetterOrDigits(String token) {
        StringBuilder sb = new StringBuilder();
        for (char ch : token.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }


    public static List<String> mergeLists(List<String>... tokensList) {
        LinkedList<String> result = new LinkedList<>();
        for (List<String> tokens : tokensList) {
            result.addAll(tokens);
        }
        return result;
    }

}