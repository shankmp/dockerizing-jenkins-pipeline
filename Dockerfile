FROM openjdk:8-jdk-alpine
COPY target/dockerizing-jenkins-pipeline.jar dockerizing-jenkins-pipeline.jar
ENTRYPOINT ["java","-jar","/dockerizing-jenkins-pipeline.jar"]