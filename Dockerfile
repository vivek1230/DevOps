FROM openjdk:11
ADD target/spring-devops.jar spring-devops.jar
ENTRYPOINT ["java", "-jar", "/spring-devops.jar"]