FROM openjdk:8

EXPOSE 8080

ADD build/libs/msa-0.0.1-SNAPSHOT.jar msa-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","msa-0.0.1-SNAPSHOT.jar"]