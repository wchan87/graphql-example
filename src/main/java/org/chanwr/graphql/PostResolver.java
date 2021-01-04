package org.chanwr.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PostResolver implements GraphQLResolver<Post> {
    private final AuthorDao authorDao;

    public Author getAuthor(Post post) {
        return authorDao.getAuthor(post.getAuthorId()).orElseThrow(RuntimeException::new);
    }
}
