package neuefisched.de.hhjava01restclienttask.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RickAndMortyInfo {
        private int count;
        private int pages;
        private String next;
        private String prev;
}

