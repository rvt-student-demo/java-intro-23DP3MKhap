package lv.rvt;


    public class DecreasingCounter {
        private int value;   // a variable that remembers the value of the counter
    
        public DecreasingCounter(int initialValue) {
            this.value = initialValue;
        }
    
        public void printValue() {
            System.out.println("value: " + this.value);
        }
    
        public void decrement() {
            this.value -= 1;
            // write the method implementation here
            // the aim is to decrement the value of the counter by one
        }
    
        // and the other methods go here
    }

