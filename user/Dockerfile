FROM amazoncorretto:17
ADD build/libs/user-0.0.1-SNAPSHOT.jar user.jar
EXPOSE 6002
ENTRYPOINT ["java","-Dserver.port=6002","-jar","user.jar"]
