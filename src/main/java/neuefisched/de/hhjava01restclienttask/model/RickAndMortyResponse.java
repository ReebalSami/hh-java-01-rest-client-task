package neuefisched.de.hhjava01restclienttask.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RickAndMortyResponse {
    List<RickAndMortyChar> results;
}
