# Stage 1: build the jar
# Use the official OpenJDK 21.0.2 base image
FROM maven:3.9.3-eclipse-temurin-17 AS build
# Set the working directory inside the container
WORKDIR /app

COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: create runtime image
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]