package lv.rvt;

public class HealthStation {

    public int number_weighings;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        number_weighings++;
        return person.getWeight();
        
    }

    public int weighings(){
        return number_weighings;
    }

    public void feed(Person person){
       person.setWeight(person.getWeight()+1);
    }

}
