package calculator.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class Calculator {
    private final CalculatorServic calculatorServic;
    public Calculator(CalculatorServic calculatorServic){
        this.calculatorServic = calculatorServic;
    }
    @GetMapping
    public String showGreetings(){
        return "Добро пожаловать в калькулятор";
    }

@GetMapping("/plus")
    public String plusNumber(@RequestParam Integer num1, @RequestParam Integer num2){
        int result = calculatorServic.plus(num1, num2);
        return generateMessage(num1, num2, '+', result);
}

@GetMapping("/minus")
public String minusNumber(@RequestParam Integer num1, @RequestParam Integer num2){
        int result = calculatorServic.minus(num1, num2);
        return generateMessage(num1, num2, '-', result);
}

    @GetMapping("/multiply")
    public String multiplyNumber(@RequestParam Integer num1, @RequestParam Integer num2){
        int result = calculatorServic.multiply(num1, num2);
        return generateMessage(num1, num2, '*', result);
    }

    @GetMapping("/divide")
    public String divideNumber(@RequestParam Integer num1, @RequestParam Integer num2){
        if(num2 == null){
            return "Невозможно делить на ноль товарищ.";
        }
        int result = calculatorServic.divide(num1, num2);
        return generateMessage(num1, num2, '/', result);
    }


    private String generateMessage(Integer num1, Integer num2, char action, Integer result){
        return  String.format("%d %c %d = %d", num1, action, num2, result);
}

   


}
