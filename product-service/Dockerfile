# Utiliser l'image OpenJDK 17 optimisée pour Alpine Linux
FROM eclipse-temurin:17-jdk-alpine

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copier le fichier JAR généré dans le conteneur
COPY ../target/ecomtrack-0.0.1-SNAPSHOT.jar app.jar

# Exposer le port utilisé par l'application
EXPOSE 8080

# Lancer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]