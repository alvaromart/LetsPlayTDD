import moduleTDD.SavingAccountYear;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by alvaro on 26/05/16.
 */
public class SavingAccountYearTest {


    @Test
    public void startingBalanceMatchesConstructor(){
        SavingAccountYear account = newAccount();
        assertEquals(10000, account.startingBalance());
    }

    @Test
    public void endingBalanceAppliesInterestRate(){
        SavingAccountYear accountYear = newAccount();
        assertEquals(11000, accountYear.endingBalance());
    }

    @Test
    public void interestRateMatchesConstructor(){
        SavingAccountYear account = newAccount();
        assertEquals(10, account.interestRate());
    }

    @Test
    public void nextYearsStartingBalanceShouldEqualTheseYearsEndingBalance(){
        SavingAccountYear thisYear = newAccount();
        assertEquals(thisYear.endingBalance(), thisYear.nextYear().startingBalance());
    }

    @Test
    public void nextYearsInterestRateEqualTheseYearInterestRate(){
        SavingAccountYear thisYear = newAccount();
        assertEquals(thisYear.interestRate(), thisYear.nextYear().interestRate());
    }

    @Test
    public void withdrawingFundsOccursAtTheBeginningOfTheYear(){
        SavingAccountYear year = new SavingAccountYear(10000, 10);
        year.withdraw(1000);
        assertEquals(9900, year.endingBalance());
    }

    @Test
    public void multiplesWithdrawInAYear(){
        SavingAccountYear year = new SavingAccountYear(10000, 10);
        year.withdraw(1000);
        year.withdraw(2000);
        assertEquals(7700, year.endingBalance());
    }

//    @Test
//    public void withdrawingMoreThanPrincipalIncursCapitalGainTax(){
//        SavingAccountYear year = new SavingAccountYear(10000, 7000, 10);
//        year.withdraw(3000);
//        assertEquals(7700, year.endingBalance());
//        year.withdraw(5000);
//        assertEquals(2000 + 200 - (1250), year.endingBalance());
//    }

    private SavingAccountYear newAccount() {
        SavingAccountYear account = new SavingAccountYear(10000,10);
        return account;
    }

    @Test
    public void principal(){
        SavingAccountYear year = new SavingAccountYear(10000, 7000, 10);
        assertEquals(3000, year.startingPrincipal());
    }

    @Test
    public void endingPrincipal(){
        SavingAccountYear year = new SavingAccountYear(10000, 7000, 10);
        assertEquals("starting principal", 3000, year.startingPrincipal());
        year.withdraw(2000);
        assertEquals("ending principal", 1000, year.endingPrincipal());
    }

    @Test
    public void endingPrincipalNeverGoesBelowZero(){
        SavingAccountYear year = new SavingAccountYear(10000, 7000, 10);
        assertEquals("starting principal", 3000, year.startingPrincipal());
        year.withdraw(4000);
        assertEquals("ending principal", 0, year.endingPrincipal());
    }

}
