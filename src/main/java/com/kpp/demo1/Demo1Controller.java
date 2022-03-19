package com.kpp.demo1;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/lab1")
    public ReturnValue greeting(@RequestParam(value = "number", defaultValue = "100") String snumber, @RequestParam(value = "calculation", defaultValue = "+1") String calculation) {

        return new ReturnValue(counter.incrementAndGet(),Long.parseLong(snumber), calculation);
    }
}
