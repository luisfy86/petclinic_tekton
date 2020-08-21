FROM openjdk:11.0.6-jdk-slim
VOLUME /tmp
EXPOSE 8080
COPY ./target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
