import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WalletTest {
    private Wallet convertor;
    @BeforeEach
    public void setUp(){
        convertor=new Wallet();
    }
    @Test
    public void checkSeventyFourPointEightFiveIsOneDollar(){
        double answer = convertor.rupeesToDollar(74.85);
        double expectedAnswer = 1;
        assertEquals(answer, expectedAnswer);
    }
    @Test
    public void getWalletBalanceInRupees(){
        convertor.depositDollarAmountToWallet(1);
        convertor.depositRupeesAmountToWallet(50);
        convertor.withdrawRupeesAmountFromWallet(50);
        double answer = convertor.getWalletAmount("Rs");
        double expectedAnswer = 74.85;
        assertEquals(answer, expectedAnswer);
    }
    @Test
    public void getWalletBalanceInDollars(){
        convertor.depositRupeesAmountToWallet(74.85);
        convertor.depositDollarAmountToWallet(1);
        convertor.depositRupeesAmountToWallet(149.7);
        double answer = convertor.getWalletAmount("$");
        double expectedAnswer = 4;
        assertEquals(answer, expectedAnswer);
    }
    @Test
    public void getWalletBalanceInEuros(){
        assertThrows(IllegalArgumentException.class,()->{convertor.depositDollarAmountToWallet(1);
            convertor.getWalletAmount("euro");});
    }
}
