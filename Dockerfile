# ---- Build Stage ----
FROM gradle:8.5-jdk21 AS build
WORKDIR /app
COPY . .
RUN ./gradlew build -x test

# ---- Runtime Stage ----
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]