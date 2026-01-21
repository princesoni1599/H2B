# Use the official OpenJDK 21.0.2 base image
FROM eclipse-temurin:11-jre-jammy

# Set the working directory inside the container
WORKDIR /app

# Copy your application JAR file into the container
# Replace "your-app-name.jar" with your actual JAR file name
COPY target/h2b-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application runs on (default example: 8080)
EXPOSE 8081

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
