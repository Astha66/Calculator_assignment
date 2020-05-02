FROM openjdk:8
EXPOSE 8080
ADD target/dockercalc.jar dockercalc.jar
ENTRYPOINT ["java","-jar","/dockercalc.jar"]