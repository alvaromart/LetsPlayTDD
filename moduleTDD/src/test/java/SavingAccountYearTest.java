import moduleTDD.SavingAccountYear;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by alvaro on 26/05/16.
 */
public class SavingAccountYearTest {


    @Test
    public void startingBalance(){
        SavingAccountYear account = new SavingAccountYear(10000,10);
        assertEquals(10000, account.startingBalance());
    }
    @Test
    public void endingBalance(){
        SavingAccountYear accountYear = new SavingAccountYear(10000,10);
        assertEquals(11000, accountYear.endingBalance());
    }


    @Test
    public void nextYearsStartingBalanceShouldEqualThisYearsEndingBalance(){
        SavingAccountYear thisYear = new SavingAccountYear(10000, 10);
        assertEquals(thisYear.endingBalance(), thisYear.nextYear().startingBalance());
    }

    @Test
    public void nextYearsInterestRateEqualTheseYearInterestRate(){
        SavingAccountYear thisYear = new SavingAccountYear(10000, 10);
        assertEquals(thisYear.interestRate(), thisYear.nextYear().interestRate());
    }

}
