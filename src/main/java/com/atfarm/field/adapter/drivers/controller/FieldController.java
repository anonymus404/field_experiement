package com.atfarm.field.adapter.drivers.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FieldController {

    private final static Logger logger = LoggerFactory.getLogger(FieldController.class);


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/greetings")
    public void greetingsController() {
        logger.info("Incoming request");
    }

}
