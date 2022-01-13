package edu.estu;

public class FrequentTerm {
    private String term;
    private int count = 1;

    public FrequentTerm(String term) {
        this.term = term;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public String getTerm() {
        return term;
    }

    @Override
    public String toString() {
        return term + " " + count;
    }
}
