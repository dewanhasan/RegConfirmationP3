FROM openjdk:19-jdk-slim

WORKDIR /app

COPY target/RegConfirmation-0.0.1-SNAPSHOT.jar /app

EXPOSE 8083

CMD ["java", "-jar", "RegConfirmation-0.0.1-SNAPSHOT.jar"]