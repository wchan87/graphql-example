* GraphQL
  * [Baeldung > Introduction to GraphQL](https://www.baeldung.com/graphql)
  * [Baeldung > Getting Started with GraphQL and Spring Boot](https://www.baeldung.com/spring-graphql)
    * [GitHub > GraphQL Spring Boot](https://github.com/graphql-java-kickstart/graphql-spring-boot)
    * [GitHub > GraphQL Java Tools](https://github.com/graphql-java-kickstart/graphql-java-tools)
    * You can use cURL to call GraphQL endpoint as per [Apollo Blog](https://www.apollographql.com/blog/4-simple-ways-to-call-a-graphql-api-a6807bcdb355/)
      ```
      curl -X POST -H "Content-Type: application/json" --data '{"query": "{recentPosts(count: 10, offset: 0) {id title category author {id name thumbnail}}}"}' http://localhost:8080/graphql
      ```
  * https://www.baeldung.com/aws-appsync-spring
  * https://www.graphql-java-kickstart.com/
  * https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/
* OpenTelemetry
  * [Medium > OpenTelemetry](https://medium.com/wwblog/auto-instrumentation-with-opentelemetry-3b096fdd068f)
