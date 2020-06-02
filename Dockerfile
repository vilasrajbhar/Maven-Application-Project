FROM openjdk:8
ADD /target/maven-project-1.0.snapshot.war maven-project-1.0.snapshot.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","/maven-project-1.0.snapshot.war"]