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

    public void withdraw(int amount) {
        balance -= amount;
    }
}
