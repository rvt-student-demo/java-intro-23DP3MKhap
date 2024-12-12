package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50){
            affordableMeals++;
            money += 2.50;
            return payment - 2.50;
        }
        else{
            return money;
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30){
            heartyMeals++;
            money += 4.30;
            return payment - 4.30;
        }
        else{
            return 0;
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() > 2.50){
            affordableMeals++;
            card.takeMoney(2.50);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() > 4.30){
            heartyMeals++;
            card.takeMoney(4.30);
            return true;
        }
        else{
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
    }

}

