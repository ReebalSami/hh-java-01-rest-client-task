package controller;

import lombok.RequiredArgsConstructor;
import model.RickAndMortyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.RickAndMortyService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RickAndMortyController {
    private final RickAndMortyService service;

    @GetMapping
    public RickAndMortyResponse getAllCharacters() {
        return service.getAllCharacters();
    }

}
