import org.example.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setup(){
        System.out.println("Initializare obiect calculator");
        calculator = new Calculator();

    }

    @AfterEach
    public void displayMessage(){
        System.out.println("acest mesaj apare dupa fiecare test");
    }

    @Test
    public void sumaTest(){
        //given (ce se da)
        int a = 2;
        int b = 3;
        //when (cand)
        int result = calculator.suma(a,b);
        //then (atunci)
        assertEquals(5,result);
    }

    @Test
    public void scadereTest(){
        //given (ce se da)
        int a = 5;
        int b = 3;
        //when (cand)
        int result = calculator.scadere(a,b);
        //then (atunci)
        assertEquals(2,result);
    }

    @Test
    public void inmultireTest(){
        //given (ce se da)
        int a = 4;
        int b = 6;
        //when (cand)
        int result = calculator.inmultire(a,b);
        //then (atunci)
        assertEquals(24,result);
    }
    @Test
    public void impartireTest(){
        //given (ce se da)
        int a = 12;
        int b = 3;
        //when (cand)
        double result = calculator.impartire(a,b);
        //then (atunci)
        assertEquals(4.0,result);
    }
}

