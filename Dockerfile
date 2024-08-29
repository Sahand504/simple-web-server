FROM openjdk:21-slim

WORKDIR /app
COPY target/simple-web-server-*.jar /app/simple-web-server.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/simple-web-server.jar"]
