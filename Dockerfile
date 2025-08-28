# Imagem base do Java
FROM openjdk:24-jdk-slim

# Diretório de trabalho no container
WORKDIR /app

# Copia o JAR para o container
COPY target/seu-app.jar app.jar

# Define a porta que a aplicação vai usar
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
