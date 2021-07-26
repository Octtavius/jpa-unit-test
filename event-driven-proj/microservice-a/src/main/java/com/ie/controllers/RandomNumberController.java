package com.ie.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RandomNumberController {

    private Log log =
            LogFactory.getLog(RandomNumberController.class);

    @RequestMapping("/random")
    public List<Integer> random() {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(generateRandomNumber());
        }

        return numbers;
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * 1000);
    }
}
