FROM openjdk:11
LABEL maintainer="slavko.anakievski@students.finki.ukim.mk"
ADD target/avtobuska_stanica-0.0.1-SNAPSHOT.jar avtobuska_stanica.jar
ENTRYPOINT ["java", "-jar", "avtobuska_stanica.jar"]