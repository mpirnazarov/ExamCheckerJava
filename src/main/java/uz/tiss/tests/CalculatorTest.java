package uz.tiss.tests;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private Calc objCalcUnderTest=new Calc();


    @Test
    public void testAdd() {
        int a = 15; int b = 20;
        int expectedResult = 35;
        //Act
        long result = (long)objCalcUnderTest.addTwoNumbers(a, b);
        //Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtract() {
        int a = 25; int b = 20;
        int expectedResult = 5;
        long result = (long)objCalcUnderTest.subtractTwoNumbers(a, b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiply() {
        int a = 10; int b = 25;
        long expectedResult = 250;
        long result = (long)objCalcUnderTest.multiplyTwoNumbers(a, b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide() {
        int a = 56; int b = 10;
        double expectedResult = 5.6;
        double result = objCalcUnderTest.divideTwoNumbers(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }

}
