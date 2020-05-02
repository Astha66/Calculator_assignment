FROM ubuntu_java

MAINTAINER Astha_Sharma

# Set Working Directory
WORKDIR /usr/local

# Copies the files from the source on the host into the container’s set destination
ADD target/calc-1.0-SNAPSHOT.jar .

# Default container command
ENTRYPOINT ["/usr/bin/java", "-cp", "calc-1.0-SNAPSHOT.jar", "com/Calc"] 
