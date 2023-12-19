FROM openjdk:8-jdk-alpine

volume /app

ADD target/rest-docker-1.0.jar restapp.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/restapp.jar"]
