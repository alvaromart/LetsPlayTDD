import moduleTDD.SavingAccounts;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by alvaro on 26/05/16.
 */
public class SavingAccountsTest {

    @Test
    public void depositAndWithdrawal(){

        SavingAccounts account = new SavingAccounts();
        account.deposit(100);
        assertEquals("after deposit", 100, account.balance());
        account.withdrawal(50);
        assertEquals("after withdrawal", 50, account.balance());
    }

    @Test
    public void negativeBalanceIsJustFine(){
        SavingAccounts account = new SavingAccounts();
        account.withdrawal(75);
        assertEquals(-75, account.balance());
    }

    @Test
    public void nextYear(){
        SavingAccounts account = new SavingAccounts();
        account.deposit(10000);
        SavingAccounts nextYear = account.nextYear(10);
        assertEquals(11000, nextYear.balance());
    }

}
