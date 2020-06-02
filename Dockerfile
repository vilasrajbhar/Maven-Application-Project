FROM openjdk:8
ADD /target/maven-project-1.0.snapshot.war /usr/local/lib/maven-project-1.0.snapshot.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/maven-project-1.0.snapshot.war"]
