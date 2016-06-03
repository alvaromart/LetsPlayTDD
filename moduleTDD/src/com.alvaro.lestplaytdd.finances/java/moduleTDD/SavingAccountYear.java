package moduleTDD;

/**
 * Created by alvaro on 26/05/16.
 */
public class SavingAccountYear {

    private int interestRate = 0;
    private int startingBalance = 0;

    public SavingAccountYear(){

    }

    public SavingAccountYear( int startingBalance, int interestRate){
        this.startingBalance = startingBalance;
        this.interestRate = interestRate;
    }

    public void deposit(int amount){
        startingBalance += amount;
    }

    public int balance() {
        return startingBalance;
    }


    public SavingAccountYear nextYear() {
        return new SavingAccountYear(this.endingBalance(), interestRate);
    }

    public int endingBalance() {
        return balance() + (balance() * interestRate/100);
    }

    public int startingBalance(){
        return startingBalance;
    }

    public int interestRate(){
        return interestRate;
    }
}
