# Imagine de baza cu Maven 3.8.4 si JDK 17
FROM maven:3.8.4-openjdk-17

# Directorul de lucru din container
WORKDIR /app

# Copiem intai pom.xml si descarcam dependentele (se pastreaza in cache intre build-uri)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copiem codul sursa si construim proiectul
COPY src ./src
COPY config ./config

# Rulam aplicatia
CMD ["mvn", "test"]