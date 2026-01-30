# 1. Usamos uma imagem mais moderna com Java 21
FROM maven:3.9.6-eclipse-temurin-21

WORKDIR /app

COPY . .

# Compila o projeto
RUN mvn clean package -DskipTests

# Inicia a aplicação
CMD ["java", "-jar", "target/linktree-0.0.1-SNAPSHOT.jar"]