from maven:3.9.8-amazoncorretto-21-al2023 as builder
workdir /app
COPY demo/pom.xml .
copy demo/src ./src
RUN mvn clean package

FROM openjdk:21-rc-oracle
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]