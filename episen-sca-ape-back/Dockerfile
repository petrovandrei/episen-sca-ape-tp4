FROM maven:3.6.1-jdk-8-alpine AS MAVEN_BUILD
COPY ./ ./
RUN mvn clean package
FROM openjdk:8-jre-alpine3.9
LABEL maintainer="andrei.petrov@etu.u-pec.fr"
RUN addgroup -S appgroup && adduser -S appuser -G appgroup

USER appuser

COPY --from=MAVEN_BUILD /target/episen-sca-ape-back-0.0.1-SNAPSHOT.jar /episen-sca-ape-back.jar


EXPOSE 8080
ENTRYPOINT ["java", "-jar", "episen-sca-ape-back.jar"]
