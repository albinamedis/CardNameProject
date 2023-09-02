import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void stringLessThanMinimum () {
        Account account = new Account("1");
        boolean actualResult = account.checkNameToEmboss();
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringMoreThanMaximum () {
        Account account = new Account("Александр Александрович");
        boolean actualResult = account.checkNameToEmboss();
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringGreaterThan3AndLessThan19 () {
        Account account = new Account("Александр Петров");
        boolean actualResult = account.checkNameToEmboss();
        boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringStartSpace () {
        Account account = new Account(" Александр Петров");
        boolean actualResult = account.checkNameToEmboss();
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringEndSpace () {
        Account account = new Account("Александр Петров ");
        boolean actualResult = account.checkNameToEmboss();
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringTwoSpace () {
        Account account = new Account("Иванов Иван Иваныч");
        boolean actualResult = account.checkNameToEmboss();
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }
}
