package calculator.calculatordemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static calculator.calculatordemo.CalculatorDemoApplicationTestsServ.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorDemoApplicationTestsParameter {
    private final CalculatorServis out = new CalculatorServis();

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void returnCorrectResultPlus(int num1, int num2){
        assertEquals(num1 + num2, out.plus(num1, num2));
    }
    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void returnCorrectResultMinus(int num1, int num2){
        assertEquals(num1 - num2, out.minus(num1, num2));
    }
    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void returnCorrectResultMultiply(int num1, int num2){
        assertEquals(num1 * num2, out.multiply(num1, num2));
    }
    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void returnCorrectResultDivide(int num1, int num2){
        assertEquals(num1 / num2, out.divide(num1, num2));
    }

private static Stream<Arguments> argumentsForCalculatorTest(){
        return Stream.of(
                Arguments.of(z0,w1),
                Arguments.of(t2,w1),
                Arguments.of(f4,f4),
                Arguments.of(f4,t2)
        );
}











}
