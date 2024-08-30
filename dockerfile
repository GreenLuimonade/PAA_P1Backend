FROM amazoncorretto:21.0.1
COPY build/libs/*.jar /app/luisgalp.jar
CMD ["java", "-jar", "/app/luisgalp.jar"]
