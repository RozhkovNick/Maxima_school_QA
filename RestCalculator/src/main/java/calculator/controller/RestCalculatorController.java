package calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import calculator.service.RestCalculatorService;

import java.math.BigDecimal;

@RestController
@RequestMapping("calculatorTests/v1")

public class    RestCalculatorController {
    RestCalculatorService calculatorService;

    public RestCalculatorController(RestCalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public ResponseEntity<BigDecimal> add(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {

        return ResponseEntity.ok(calculatorService.add(a, b));
    }


    @GetMapping("/subtract")
    public BigDecimal subtract(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return calculatorService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public BigDecimal multiply(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/division")
    public BigDecimal division(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return calculatorService.division(a, b);
    }

    @GetMapping("/pow")
    public BigDecimal pow(@RequestParam BigDecimal a, @RequestParam int pow) {
        return calculatorService.pow(a,pow);
    }
}