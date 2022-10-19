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

}