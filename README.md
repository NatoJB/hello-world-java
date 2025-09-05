# Hello World Java

This is a simple Maven-based Java project.

- Java 17
- JUnit 5
- Checkstyle
- SpotBugs
- Google Java Format (fmt-maven-plugin)

Run tests:

```
mvn -q -DskipITs test
```

Run app:

```
mvn -q -DskipTests package && java -cp target/hello-world-java-1.0.0-SNAPSHOT.jar com.example.helloworld.Main
```
