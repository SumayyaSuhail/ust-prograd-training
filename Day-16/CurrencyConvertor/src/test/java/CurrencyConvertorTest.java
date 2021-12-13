import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CurrencyConvertorTest {
    private CurrencyConvertor convertor;
    @BeforeEach
    public void setUp(){
        convertor=new CurrencyConvertor();
    }
    @Test
    public void checkSeventyFourPointEightFiveIsOneDollar(){
        double answer = convertor.rupeesToDollar(74.85);
        double expectedAnswer = 1;
        assertEquals(answer, expectedAnswer);
    }
    @Test
    public void getWalletBalanceInRupees(){
        convertor.addDollarInputToWallet(1);
        convertor.addRupeesInputToWallet(50);
        convertor.subtractRupeesInputFromWallet(50);
        double answer = convertor.getWalletAmount("Rs");
        double expectedAnswer = 74.85;
        assertEquals(answer, expectedAnswer);
    }
    @Test
    public void getWalletBalanceInDollars(){
        convertor.addRupeesInputToWallet(74.85);
        convertor.addDollarInputToWallet(1);
        convertor.addRupeesInputToWallet(149.7);
        double answer = convertor.getWalletAmount("$");
        double expectedAnswer = 4;
        assertEquals(answer, expectedAnswer);
    }
    @Test
    public void getWalletBalanceInEuros(){
        double expectedAnswer = 4;
        assertThrows(IllegalArgumentException.class,()->{convertor.addDollarInputToWallet(1);
            double answer = convertor.getWalletAmount("euro");});
    }
}
