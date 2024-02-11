FROM amazoncorretto:17
ADD build/libs/api-0.0.1-SNAPSHOT.jar api.jar
EXPOSE 6001
ENTRYPOINT ["java","-Dserver.port=6001","-jar","api.jar"]
