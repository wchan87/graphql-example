package org.chanwr.configuration;

import org.chanwr.graphql.Author;
import org.chanwr.graphql.AuthorDao;
import org.chanwr.graphql.AuthorResolver;
import org.chanwr.graphql.Mutation;
import org.chanwr.graphql.Post;
import org.chanwr.graphql.PostDao;
import org.chanwr.graphql.PostResolver;
import org.chanwr.graphql.Query;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Configuration
public class GraphQLConfiguration {
    // TODO consider switching Bean to Component/Service
    @Bean
    public PostDao postDao() {
        List<Post> posts = new ArrayList<>();
        IntStream.range(0, 10).forEach(postId -> {
            IntStream.range(0, 10).forEach(authorId -> {
                Post post = new Post();
                post.setId("Post" + authorId + postId);
                post.setTitle("Post " + authorId + ":" + postId);
                post.setText("Post " + postId + " + by author " + authorId);
                post.setAuthorId("Author" + authorId);
                posts.add(post);
            });
        });
        return new PostDao(posts);
    }

    @Bean
    public AuthorDao authorDao() {
        List<Author> authors = new ArrayList<>();
        IntStream.range(0, 10).forEach(authorId -> {
            Author author = new Author();
            author.setId("Author" + authorId);
            author.setName("Author " + authorId);
            author.setThumbnail("http://example.com/authors/" + authorId);
            authors.add(author);
        });
        return new AuthorDao(authors);
    }

    @Bean
    public PostResolver postResolver(AuthorDao authorDao) {
        return new PostResolver(authorDao);
    }

    @Bean
    public AuthorResolver authorResolver(PostDao postDao) {
        return new AuthorResolver(postDao);
    }

    @Bean
    public Query query(PostDao postDao) {
        return new Query(postDao);
    }

    @Bean
    public Mutation mutation(PostDao postDao) {
        return new Mutation(postDao);
    }
}
