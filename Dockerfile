FROM openjdk:17-jdk-alpine
COPY target/electify-0.0.1-SNAPSHOT.jar electify-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/electify-0.0.1-SNAPSHOT.jar"]