package edu.estu;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

import java.util.ArrayList;
import java.util.List;

public class Options {
    @Option(name = "-task")
    private String taskName;

    @Option(name = "-r")
    private boolean reverseOrder;

    @Option(name = "-u")
    private boolean uniqueValues;

    @Option(name = "-topN")
    private int topN = 5;

    @Option(name = "-start")
    private String start;

    @Argument
    private List<String> files = new ArrayList<String>();

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isReverseOrder() {
        return reverseOrder;
    }

    public void setReverseOrder(boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }

    public boolean isUniqueValues() {
        return uniqueValues;
    }

    public void setUniqueValues(boolean uniqueValues) {
        this.uniqueValues = uniqueValues;
    }

    public int getTopN() {
        return topN;
    }

    public void setTopN(int topN) {
        this.topN = topN;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "Options{" +
                "taskName='" + taskName + '\'' +
                ", reverseOrder=" + reverseOrder +
                ", uniqueValues=" + uniqueValues +
                ", topN=" + topN +
                ", start='" + start + '\'' +
                ", files=" + files +
                '}';
    }
}
