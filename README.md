# Project Library

Minimal Spring Boot application providing a starting point for a library-related service.

## Stack

\* Java (25+)  
\* Spring Boot  
\* Maven

## Structure

\* `src/main/java` — application sources  
\* `src/test/java` — tests  
\* `pom.xml` — build configuration  
\* `src/main/java/com/riverfount/JavaLibraryManager/JavaLibraryManagerApplication.java` — entry point

## Build

```bash
mvn clean package
```

## Run

```bash
mvn spring-boot:run
```

Or execute the packaged jar:

```bash
java -jar target/projectlibrary-*.jar
```

## Test

```bash
mvn test
```

## Development

Use IntelliJ IDEA for running, debugging, and editing. Adjust Java version in `pom.xml` if required.

## Configuration

Add custom properties in `src/main/resources/application.properties`.

## Next Steps

\* Add domain models and persistence layer  
\* Implement REST controllers  
\* Add integration and unit tests

## License

Insert licensing details.