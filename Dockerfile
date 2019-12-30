FROM openjdk:8

#EXPOSE 1825
#ADD target/test-docker.jar test-docker.jar 
#ENTRYPOINT ["java","-jar","/test-docker.jar"]

# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine

RUN apk add --no-cache bash

# copy fat JAR
COPY target/test-docker.jar /test-docker.jar

# copy fat JAR
COPY logback.xml /logback.xml

COPY run.sh /run.sh

ENTRYPOINT ["/run.sh"]