FROM openjdk:11.0.11-oracle

#COPY ./target/cicd-boot-docker-0.0.1-SNAPSHOT.jar .
COPY ./cicd-boot-docker-0.0.1-SNAPSHOT.jar .

CMD ["java","-jar","cicd-boot-docker-0.0.1-SNAPSHOT.jar"]
