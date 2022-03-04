FROM openjdk:17.0-slim
EXPOSE 11001
ARG JAR_FILE
ADD target/${JAR_FILE} /app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]