package neuefisched.de.hhjava01restclienttask.controller;

import lombok.RequiredArgsConstructor;
import neuefisched.de.hhjava01restclienttask.model.RickAndMortyChar;
import neuefisched.de.hhjava01restclienttask.model.RickAndMortyResponse;
import org.springframework.web.bind.annotation.*;
import neuefisched.de.hhjava01restclienttask.service.RickAndMortyService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RickAndMortyController {
    private final RickAndMortyService service;

    @GetMapping("/characters")
    public RickAndMortyResponse getAllCharacters(@RequestParam(required = false) String status) {
        if (status != null && !status.isEmpty()) {
            // Filter characters by status
            return service.getCharactersByStatus(status);
        } else {
            // If no status parameter is provided, return all characters
            return service.getAllCharacters();
        }
    }

    @GetMapping("/character/{id}")
    public RickAndMortyChar getCharacterById(@PathVariable int id) {
        return service.getCharacterById(id);
    }

    @GetMapping("/species-statistic")
    public int getSpeciesStatistic(@RequestParam String species) {
        return service.getSpeciesStatistic(species);
    }
}
