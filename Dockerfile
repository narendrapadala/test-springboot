FROM openjdk:8
EXPOSE 1825
ADD target/test-docker.jar test-docker.jar 
ENTRYPOINT ["java","-jar","/test-docker.jar"]