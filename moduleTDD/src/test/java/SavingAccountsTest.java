import moduleTDD.SavingAccounts;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by alvaro on 26/05/16.
 */
public class SavingAccountsTest {

    @Test
    public void depositAndWithDrawal(){

        SavingAccounts account = new SavingAccounts();
        account.deposit(100);
        assertEquals("after deposit", 100, account.balance());
        account.withdraw(50);
        assertEquals("after withdrawal", 50, account.balance());
    }

    @Test
    public void negativeBalanceIsJustFine(){
        SavingAccounts account = new SavingAccounts();
        account.withdraw(75);
        assertEquals(-75, account.balance());
    }



}
