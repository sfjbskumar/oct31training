<<<<<<< HEAD
FROM openjdk
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
=======
FROM openjdk
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
>>>>>>> e4fbf5beee5c498f6e26d1abd48d7de3240df450
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]