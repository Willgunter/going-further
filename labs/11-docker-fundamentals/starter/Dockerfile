# build stage
FROM maven:3.9-eclipse-temurin-21 AS build

WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

# runtime environment
FROM maven:3.9-eclipse-temurin-21
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
HEALTHCHECK --interval=30s --timeout=3s --retries=3 \ 
    CMD wget --spider -q http://localhost:8080/actuator/health || exit 1