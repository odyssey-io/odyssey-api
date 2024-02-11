# odyssey-api

In both options the services will be run with a tomcat server for testing.


Run the services locally for testing, the services can be accessed on ports 6001 and 6002
```
./gradlew -parallel runMicroservices
```

Alternatively build and test in docker. Ensure that docker is running and then run the following commands. The docker images will be run on the ports 6001 and 6002.
```
cd user
./gradlew build
docker build -t user:0.0.1-SNAPSHOT .

cd ../registration
./gradlew build
docker build -t api:0.0.1-SNAPSHOT .

cd ../
docker-compose up -d 
```