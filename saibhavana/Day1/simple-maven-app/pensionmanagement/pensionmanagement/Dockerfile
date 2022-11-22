FROM openjdk
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.mvnsecurity.egd=file:/dev/./urandom","-jar","/app.jar"]