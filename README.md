### Overview ###
Dictionary-service is an simple application that prints in the console few words from provided dictionaries.

This is an example of an extensible application.
It is created by following [this](https://docs.oracle.com/javase/tutorial/ext/basics/spi.html) java tutorial.

An extensible application is one that you can extend without modifying its original code base. You can read more about it
in the provided link.

### Run
This application is using [Gradle](https://gradle.org) as a build tool, and has a Gradle wrapper setup, so in order to run it,
navigate to the project root and use the following command:

```
./gradlew run
```

### Project structure
This project has four modules:
1. computer-science-dictionary
2. dictionary-client
3. dictionary-service-provider
4. general-dictionary

#### dictionary-client
A module that is a client of `dictionary-service-provider`. It has a main method, that simply prints few words retrieved
from `dictionary service`.

#### dictionary-service-provider
It includes a `dictionary service` that tries to find a word by retrieving all dictionaries found on classpath, and
looking if they have the word. This is the most important part because new dictionaries can be added
without the need to change any existing code.

It also defines an interface that every dictionary must implement.

#### computer-science-dictionary and general-dictionary
Two dictionary implementations each containing a set of words.

### Extension
To add a new dictionary:
1. Create a new module and add it to `settings.gradle` in the root project
2. Add a dependency to `dictionary-service-provider`
3. Implement `dictionary` interface
4. Add file `dictionary.spi.Dictionary` in resources (see how it's done in existing projects)

### Testing
In order to run tests, use:
```
./gradlew test
```
