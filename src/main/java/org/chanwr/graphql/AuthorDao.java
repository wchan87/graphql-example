package org.chanwr.graphql;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class AuthorDao {
    private final List<Author> authors;

    public Optional<Author> getAuthor(String id) {
        return authors.stream().filter(author -> id.equals(author.getId()))
                .findFirst();
    }
}
