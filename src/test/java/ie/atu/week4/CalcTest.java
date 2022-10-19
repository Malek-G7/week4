package ie.atu.week4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {

    Calc myCalc = new Calc();

    @BeforeEach
    void setUp() {
        myCalc = new Calc();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testAdd(){
        assertEquals(3,myCalc.add(1,2));
    }
    @Test
    void testSubtract(){
        assertEquals(1,myCalc.subtract(3,2));
    }
    @Test
    void testMultiply(){
        assertEquals(6,myCalc.multiply(3,2));
    }
    @Test
    void testDivide(){
        assertEquals(3,myCalc.divide(6,2));
    }

}