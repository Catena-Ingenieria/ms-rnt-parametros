FROM openjdk:17

WORKDIR /app
COPY ./target/rnt-parametros-1.0.0.jar /app

EXPOSE 8080

CMD ["java", "-jar", "rnt-parametros-1.0.0.jar"]