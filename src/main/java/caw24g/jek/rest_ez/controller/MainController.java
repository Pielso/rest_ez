package caw24g.jek.rest_ez.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello, World!";
    }

    @GetMapping("/goodbye")
    public String getGoodbye() {
        return "Goodbye, World!";
    }


}
