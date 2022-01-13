package edu.estu;

import edu.estu.sorters.SortByCountAscendingOrder;
import edu.estu.sorters.SortByCountDescendingOrder;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws CmdLineException, IOException {
        Options options = parseArguments(args);
        List<String> tokens = new LinkedList<>();
        for (String file : options.getFiles()) {
            tokens.addAll(TokenProcessor.readFile(file));
        }
        String taskName = options.getTaskName();
        if ("NumOfTokens".equals(taskName)) {
            numOfTokensTask(options, tokens);
        } else if ("FrequentTerms".equals(taskName)) {
            frequentTermsTask(options, tokens);
        } else if ("TermLengthStats".equals(taskName)) {
            termLengthStats(options, tokens);
        } else if ("TermsStartWith".equals(taskName)) {
            Set<String> startedTokens = new HashSet<>();
            for (String token : tokens) {
                if (token.startsWith(options.getStart())) {
                    startedTokens.add(token);
                }
            }
            LinkedList<String> list = new LinkedList<>(startedTokens);
            Collections.sort(list);
            if (options.isReverseOrder()) {
                Collections.reverse(list);
            }
            for (int i = 0; i < options.getTopN() && i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }

    private static void numOfTokensTask(Options options, List<String> tokens) {
        if (options.isUniqueValues()) {
            System.out.println("Number of Tokens: " + new HashSet<>(tokens).size());
        } else {
            System.out.println("Number of Tokens: " + tokens.size());
        }
    }

    private static void frequentTermsTask(Options options, List<String> tokens) {
        Map<String, FrequentTerm> frequentTermMap = new HashMap<>();
        for (String token : tokens) {
            if (frequentTermMap.containsKey(token))
                frequentTermMap.get(token).increment();
            else
                frequentTermMap.put(token, new FrequentTerm(token));
        }
        List<FrequentTerm> frequentTerms = new ArrayList<>(frequentTermMap.values());
        if (!options.isReverseOrder()) {
            Collections.sort(frequentTerms, new SortByCountDescendingOrder());
            for (int i = 0; i < options.getTopN() && i < frequentTerms.size(); i++) {
                System.out.println(frequentTerms.get(i));
            }
        } else {
            Collections.sort(frequentTerms, new SortByCountAscendingOrder());
            for (int i = 0; i < options.getTopN() && i < frequentTerms.size(); i++) {
                System.out.println(frequentTerms.get(i));
            }
        }
    }

    private static void termLengthStats(Options options, List<String> tokens) {
        if (!options.isUniqueValues()) {
            printListStatistics(tokens);
        } else {
            printListStatistics(new HashSet<>(tokens));
        }
    }

    private static void printListStatistics(Collection<String> tokens) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, total = 0;
        for (String token : tokens) {
            min = Math.min(min, token.length());
            max = Math.max(max, token.length());
            total += token.length();
        }
        System.out.println("Max Token Length in Character: " + max +
                ", Min Token Length: " + min +
                ", Average Token Length: " + ((double) total / tokens.size()));
    }


    public static Options parseArguments(String... args) throws CmdLineException {
        Options options = new Options();
        CmdLineParser parser = new CmdLineParser(options);
        parser.parseArgument(args);
        return options;
    }
}
