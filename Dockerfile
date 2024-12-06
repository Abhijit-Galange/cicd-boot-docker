FROM openjdk:11.0.11-oracle

COPY ./target/boot-docker-0.0.1-SNAPSHOT.jar .

CMD ["java","-jar","boot-docker-0.0.1-SNAPSHOT.jar"]