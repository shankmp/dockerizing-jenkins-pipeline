FROM openjdk:8
COPY target/dockerizing-jenkins-pipeline.jar dockerizing-jenkins-pipeline.jar
ENTRYPOINT ["java","-jar","/dockerizing-jenkins-pipeline.jar"]