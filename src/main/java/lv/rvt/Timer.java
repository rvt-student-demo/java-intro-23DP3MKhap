package lv.rvt;

public class Timer {
        private ClockHand hundred_second;
        private ClockHand second;


    public Timer(){
        this.hundred_second = new ClockHand(100);
        this.second = new ClockHand(60);
    }

    public void advance(){
        this.hundred_second.advance();

        if (this.hundred_second.value() == 0){
            this.second.advance();
        }
    }

    public String toString(){
        return second + ":" + hundred_second;
    }
}
