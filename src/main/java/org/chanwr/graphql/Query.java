package org.chanwr.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Query implements GraphQLQueryResolver {
    private final PostDao postDao;

    public List<Post> getRecentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }
}
