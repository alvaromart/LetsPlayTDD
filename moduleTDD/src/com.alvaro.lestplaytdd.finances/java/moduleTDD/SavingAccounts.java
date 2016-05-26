package moduleTDD;

/**
 * Created by alvaro on 26/05/16.
 */
public class SavingAccounts {

    private int balance = 0;

    public void deposit(int amount) {
        balance = amount;
    }

    public int balance() {
        return balance;
    }

    public void withdrawal(int amount) {
        balance -= amount;
    }

    public SavingAccounts nextYear(int interestRate) {

        SavingAccounts result = new SavingAccounts();
        result.deposit((balance()+ (balance() * interestRate /100)));
        return result;
    }
}
