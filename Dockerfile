FROM openjdk:8

EXPOSE 8081

ADD target/dockerkubedemo.jar dockerkubedemo.jar

ENTRYPOINT ["java","-jar","dockerkubedemo.jar"]