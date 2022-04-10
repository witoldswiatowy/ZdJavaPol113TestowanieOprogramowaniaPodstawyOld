import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    //metoda, która inicjalizuje zmienne klasowe, może np. tworzyć strukture katalogu, tworzący plik
    //nawiżazywać polączenie do bazy danych
    @BeforeEach
    void setUp () {
        calculator = new Calculator();
    }


    @Test
    void add() {
        //given
        int aa = 4;
        int bb = 6;
        //when
        int result = calculator.add(aa,bb);
        //then
//        Assertions.assertEquals(10, result);
        assertNotNull(calculator); // czasmi mamy kilka asersji
        Assertions.assertEquals(10, result, "wrong result");
    }

    //PVT
    //SIT UAT PRD
}