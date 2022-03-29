package com.example.restservice;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorController {
	@GetMapping("/calculator")
	public Calculator greeting(@RequestParam(value = "number1") String number1,
	@RequestParam(value = "operator") String operator,
	@RequestParam(value = "number2") String number2) {
		double answer=0;
		if (operator.equals("+")){
			answer = Double.parseDouble(number1) + Double.parseDouble(number2);
		}
		if (operator.equals("-")){
			answer = Double.parseDouble(number1) - Double.parseDouble(number2);
		}
		if (operator.equals("/")){
			answer = Double.parseDouble(number1) / Double.parseDouble(number2);
		}
		if (operator .equals( "*")){
			answer = Double.parseDouble(number1) * Double.parseDouble(number2);
		}
		if (operator .equals( "**")){
			answer = Math.pow(Double.parseDouble(number1), Double.parseDouble(number2));
		}
		return new Calculator(answer);
}}