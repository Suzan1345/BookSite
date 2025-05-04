package de.htwberlin.webtech.LifePlaner.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping(path="/")
    public ModelAndView showHelloWorldPage(){
        return new ModelAndView("helloworld");

    }
}
