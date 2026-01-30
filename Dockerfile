# Usa uma imagem que já tem Maven e Java 17 instalados
FROM maven:3.8.5-openjdk-17

# Define a pasta de trabalho
WORKDIR /app

# Copia os arquivos do seu projeto para dentro do container
COPY . .

# Roda o comando de build (agora vai funcionar pois corrigimos o código!)
RUN mvn clean package -DskipTests

# Comando para iniciar o site
CMD java -jar target/*.jar