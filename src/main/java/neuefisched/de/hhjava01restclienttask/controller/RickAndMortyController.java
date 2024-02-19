package neuefisched.de.hhjava01restclienttask.controller;

import lombok.RequiredArgsConstructor;
import neuefisched.de.hhjava01restclienttask.model.RickAndMortyChar;
import neuefisched.de.hhjava01restclienttask.model.RickAndMortyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import neuefisched.de.hhjava01restclienttask.service.RickAndMortyService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RickAndMortyController {
    private final RickAndMortyService service;

    @GetMapping("/characters")
    public RickAndMortyResponse getAllCharacters() {
        return service.getAllCharacters();
    }

    @GetMapping("/characters/{id}")
    public RickAndMortyChar getCharacterById(@PathVariable int id) {
        return service.getCharacterById(id);
    }

}
