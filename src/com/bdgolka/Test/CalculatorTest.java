package com.bdgolka.Test;

import com.bdgolka.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void shouldEvaluateConstants(){
        int result = calculator.evalute("1");
        assertEquals(1, result);
    }

    @Test
    public void shouldSupportAdding(){
        int result = calculator.evalute("1 + 2");
        assertEquals(3, result);
    }

    @Test
    public void shouldSupportSubstraction(){
        int result = calculator.evalute("1 - 2");
        assertEquals(-1, result);
    }

    @Test
    public void shouldComplexStatement(){
        int result = calculator.evalute("1 - 3 + 2 + 4");
        assertEquals(4, result);
    }
}