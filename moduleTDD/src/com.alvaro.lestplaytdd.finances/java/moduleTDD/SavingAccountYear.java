package moduleTDD;

/**
 * Created by alvaro on 26/05/16.
 */
public class SavingAccountYear {

    private int interestRate = 0;
    private int startingBalance = 0;
    private int capitalGainsAmmount = 0;

    public SavingAccountYear(){

    }

    public SavingAccountYear( int startingBalance, int interestRate){
        this.startingBalance = startingBalance;
        this.interestRate = interestRate;
    }

    public SavingAccountYear( int startingBalance, int capitalGainsAmmount, int interestRate){
        this.startingBalance = startingBalance;
        this.capitalGainsAmmount = capitalGainsAmmount;
        this.interestRate = interestRate;
    }

    public int startingBalance(){
        return startingBalance;
    }

    public int interestRate(){
        return interestRate;
    }

    public int endingBalance() {
        return startingBalance + (startingBalance * interestRate/100);
    }

    public SavingAccountYear nextYear() {
        return new SavingAccountYear(this.endingBalance(),interestRate);
    }

    public void withdraw(int amount) {
        startingBalance -= amount;
    }
}
