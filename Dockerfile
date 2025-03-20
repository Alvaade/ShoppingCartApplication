FROM maven:latest
LABEL authors="adeai"
WORKDIR /app
COPY pom.xml /app/
COPY src /app/
RUN mvn package
CMD ["java", "-jar", "target/ShoppingCartApplication-1.0-SNAPSHOT.jar"]