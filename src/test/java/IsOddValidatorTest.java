import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsOddValidatorTest {

//    @Disabled         //adnotacja wyłączająca test
    @DisplayName("Verification should pass for odd number")
    @Test
    void verificationShouldPassForOddNumber () {
        //arrange
        IsOddValidator validator = new IsOddValidator();
        final int oddNumber = 12;  //powinnismy psuc testy, np dajac 11
        //act
        boolean isOdd = validator.isOdd(oddNumber);
        //assert
        Assertions.assertTrue(isOdd);   //można zrobić to jak niżej bez Assertions., ale to jest pomocne z której paczki wywoływana jest ta metoda
//        assertTrue(isOdd);

        //ten test sprawdza tylko jeden scenariusz i czy parzyste sa parzyste
    }

    @DisplayName("Verification should fail for odd number")
    @Test
    void verificationShouldFailForOddNumber () {
        //arrange
        IsOddValidator validator = new IsOddValidator();
        final int oddNumber = 11;
        //act
        boolean isOdd = validator.isOdd(oddNumber);
        //assert
        Assertions.assertFalse(isOdd);

        //ten test sprawdza tylko jeden scenariusz i czy parzyste sa nieparzyste
    }


}