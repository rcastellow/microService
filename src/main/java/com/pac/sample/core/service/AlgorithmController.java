package com.pac.sample.core.service;

import com.pac.sample.core.db.HistoryRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.atomic.AtomicLong;

/**
 * AlogrithmController - Created by RobCastellow on 8/20/16.
 *
 * 1) Factor a Number - Provides all factors of a given number
 * 2) Palindrome - test for palindromes
 * 3) Fibonacci - Calculates the fibonacci number
 *
 */

@Api(value="algorithms", description="Sample RESTful operations created via microservices.")
@RestController
public class AlgorithmController {

    private final AtomicLong counter = new AtomicLong();

    @Autowired
    HistoryRepository historyRepository ;


    @ApiOperation(value = "Provide all the factored values of the provided integer.",
            notes = "Provide an integer as the value input and the factors of this integer will be returned",
            response = Factor.class)
    @RequestMapping(path = "/algorithms/factor", method= RequestMethod.GET)
    public @ResponseBody
    Factor factor(@RequestParam(value="value", required=true) String value) {
//        historyRepository.save()
        return new Factor(counter.incrementAndGet(), Integer.parseInt(value));
    }

    @ApiOperation(value = "Provides whether the entered value is the same value reversed (a palindrome).",
            notes = "Provide a string as the value input and the endpoint will determine if this string is indeed" +
                    "a palindorme.",
            response = Palindrome.class)
    @RequestMapping(path = "/algorithms/palindrome", method= RequestMethod.GET)
    public @ResponseBody
    Palindrome palindrome(@RequestParam(value="value", required=true) String value) {
//        historyRepository.save()
        return new Palindrome(counter.incrementAndGet(), value);
    }

    @ApiOperation(value = "Provide the Fibonacci value of the integer provided.",
            notes = "Provide an integer as the value input and determines the Fibonaccti of this integer.",
            response = Fibonacci.class)
    @RequestMapping(path = "/algorithms/fibonacci", method= RequestMethod.GET)
    public @ResponseBody
    Fibonacci fibonacci(@RequestParam(value="value", required=true) String value) {
//        historyRepository.save()
        return new Fibonacci(counter.incrementAndGet(), Integer.parseInt(value));
    }

    public class BadStatus {
        String errorMessage;
        boolean status = false;

        public BadStatus(String msg) { errorMessage = msg; }
    }

    @ExceptionHandler(Exception.class)
    public BadStatus handleException(Exception ex, HttpServletRequest request) {
        return new BadStatus(ex.getMessage());
    }
}
