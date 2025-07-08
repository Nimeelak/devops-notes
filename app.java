# Sample Java Project

This is a sample Java project that prints "Hello, World!" to the console and includes a simple JUnit test.

## Structure

```
sample-java-project/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── App.java
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── AppTest.java
├── pom.xml
```

## Build & Run

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.example.App"
```

## Test

```bash
mvn test
```
