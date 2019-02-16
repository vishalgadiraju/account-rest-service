FROM openjdk:8-jdk-alpine
COPY ./target/account-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app 
EXPOSE 8080
RUN sh -c 'touch account-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","account-0.0.1-SNAPSHOT.jar"]
