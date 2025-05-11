package de.htwberlin.webtech.LifePlaner.web;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanerController {

    @GetMapping(path = "/planer")
    public ResponseEntity<Planer> getPlaner(){
        final Planer planer = new Planer("Uni", "Planung",18.25,20.15,"Berlin");
        return ResponseEntity.ok(planer);
    }
}
