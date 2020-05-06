# Start with a base image containing Java runtime
FROM openjdk:8
# Add Maintainer Info
LABEL maintainer="github.com/Astha66"
# Make port 8080 available to the world outside this container

# Add the application's jar to the container
ADD target/calculator-1.0-SNAPSHOT.jar calculator-1.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","calculator-1.0-SNAPSHOT.jar","com.Calc"]

# Run the jar file

