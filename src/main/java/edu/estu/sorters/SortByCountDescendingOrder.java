package edu.estu.sorters;

import edu.estu.FrequentTerm;

import java.util.Comparator;

public class SortByCountDescendingOrder implements Comparator<FrequentTerm> {
    @Override
    public int compare(FrequentTerm o1, FrequentTerm o2) {
        if (o1.getCount() < o2.getCount())
            return 1;
        else if (o1.getCount() > o2.getCount())
            return -1;
        else
            return o1.getTerm().compareTo(o2.getTerm());
    }
}
