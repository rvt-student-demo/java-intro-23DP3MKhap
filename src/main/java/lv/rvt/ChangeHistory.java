package lv.rvt;

import java.util.ArrayList;


public class ChangeHistory {

    private ArrayList<Double> records;

    public ChangeHistory(){
        this.records = new ArrayList<>();
    }

    public void add(double balance){
        records.add(balance);
    }

    public void clear(){
        records.clear();
    }

    public double maxValue(){
        double max = 0;
        if (records.size() <= 0){
            return 0;
        }
        for (int i = 0; i < records.size(); i++ ){
            if (records.get(i) > max){
                max = records.get(i);
            }
        }
        return max;
    }

    public double minValue(){
        if (records.size() <= 0){
            return 0;
        }
        double min = records.get(0);
        for (int i = 0; i < records.size(); i++ ){
            if (records.get(i) < min){
                min = records.get(i);
            }
        }
        return min;
    }

    public double average(){
        double sum = 0;
        if (records.size() <= 0){
            return 0;
        }
        for (int i = 0; i < records.size(); i++){
            sum += records.get(i);
        }
        return sum/records.size();
        
    }


    @Override
    public String toString(){
        return records.toString();
    }
}
