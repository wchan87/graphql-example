package org.chanwr.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class AuthorResolver implements GraphQLResolver<Author> {
    private final PostDao postDao;

    public List<Post> getPosts(Author author) {
        return postDao.getAuthorPosts(author.getId());
    }
}
