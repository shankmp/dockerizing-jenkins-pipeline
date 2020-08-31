FROM openjdk:8
COPY target/*.jar dockerizing-jenkins-pipeline.jar
ENTRYPOINT ["java","-jar","/dockerizing-jenkins-pipeline.jar"]