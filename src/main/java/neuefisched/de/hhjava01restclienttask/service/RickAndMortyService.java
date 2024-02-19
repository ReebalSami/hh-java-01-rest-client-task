package neuefisched.de.hhjava01restclienttask.service;


import neuefisched.de.hhjava01restclienttask.model.RickAndMortyChar;
import neuefisched.de.hhjava01restclienttask.model.RickAndMortyResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponentsBuilder;

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

    public RickAndMortyChar getCharacterById(int id) {
        return restClient.get()
                .uri("/character/{id}", id)
                .retrieve()
                .body(RickAndMortyChar.class);
    }


    public RickAndMortyResponse getCharactersByStatus(String status) {
        return restClient.get()
                .uri("/character?status={status}", status)
                .retrieve()
                .body(RickAndMortyResponse.class);
    }

    public int getSpeciesStatistic(String species){
        RickAndMortyResponse response =  restClient.get()
                .uri("/character?status=alive&species={species}", species)
                .retrieve()
                .body(RickAndMortyResponse.class);
        if(response == null){
            return 0;
        }
        if(response.getInfo() == null){
            return 0;
        }
        return response.getInfo().getCount();
    }


}
