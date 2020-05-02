FROM ubuntu_java

MAINTAINER Astha_Sharma

# Set Working Directory
WORKDIR /usr/local
#
# Copies the files from the source on the host into the container’s set destination
ADD target/calc.jar .

# Default container command
ENTRYPOINT ["/usr/bin/java", "-cp", "calc.jar", "com/Calc"]
