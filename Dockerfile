FROM openjdk:8-jdk-alpine

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/field_experiment-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} field-experiment.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/field-experiment.jar"]
