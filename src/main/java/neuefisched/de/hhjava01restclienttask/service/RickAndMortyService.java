package neuefisched.de.hhjava01restclienttask.service;


import neuefisched.de.hhjava01restclienttask.model.RickAndMortyResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class RickAndMortyService {
    private RestClient restClient = RestClient.builder()
            .baseUrl("https://rickandmortyapi.com/api")
            .build();

    public RickAndMortyResponse getAllCharacters() {
        return restClient.get()
                .uri("/character")
                .retrieve()
                .body(RickAndMortyResponse.class);
    }

}
