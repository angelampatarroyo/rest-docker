FROM openjdk:8-jdk-alpine

volume /app

ADD target/rest-1.0.0.jar rest.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/rest.jar"]
