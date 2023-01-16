package com.example.useoptionals.optionals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    GuitaristService guitaristService;

    @GetMapping(value = "guitarist/{lastName}") // same as @GetMapping(path = "free/guitarist/{lastName}")
    public Guitarist getGuitarist(@PathVariable String lastName) {
        Optional<Guitarist> guitarist = guitaristService.findByLastName(lastName);
        //guitarist.ifPresent(g -> System.out.println("Album by this guitarist is " + g.getAlbum()));
        return guitarist.get();
        //return guitarist.orElse(new Guitarist("dummy", "dummy", "dummy"));
    }

}
