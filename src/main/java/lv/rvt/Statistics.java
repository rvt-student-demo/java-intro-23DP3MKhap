package lv.rvt;

public class Statistics {


    private int count;
    private int summ;
    private int evensumm;
    private int oddsumm;

    public Statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        summ += number;
        count += 1;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return summ;
    }

    public double average() {
        
        return (double)summ/count;

    }
}
