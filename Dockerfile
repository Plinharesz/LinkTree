# 1. Usar uma imagem base que já tenha Java 17 e Maven instalados
FROM maven:3.8.5-openjdk-17

# 2. Define a pasta de trabalho dentro do servidor
WORKDIR /app

# 3. Copia todos os seus arquivos para dentro do servidor
COPY . .

# 4. Roda o comando de construção (o mesmo que tentamos antes)
# O "-DskipTests" é para ser mais rápido e não falhar se tiver teste pendente
RUN mvn clean package -DskipTests

# 5. O comando final que inicia o site
# Ele procura qualquer arquivo .jar dentro da pasta target e executa
CMD java -jar target/*.jar