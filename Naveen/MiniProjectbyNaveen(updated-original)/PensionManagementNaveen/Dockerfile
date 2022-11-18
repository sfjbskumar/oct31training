FROM openjdk
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=fsile:/dev/./urandom","-jar","/app.jar"]