# Sample Spring boot with Gradle and Docker
# Prerequisite
- must have Docker installed 
- https://www.docker.com/products/docker-engine 

# Sample API
- local api when running with local docker is (http://localhost:5001/demo)
- local api when running this spring boot app through IDEA (http://localhost:8080/demo)

- build jar for this project:
    - $ ./gradlew clean build
    - docker-demo-0.0.1-SNAPSHOT.jar will be created under build/libs/

# Docker command
- $ docker build -t docker-demo . //dockerize your springboot app using Dockerfile
- $ docker image ls //see list of docker images
- $ docker run -p 5001:8080 docker-demo //run your docker image that you just build on port 5000
- $ docker container ls //list all of your running container
- $ docker stop <CONTAINER ID> // to stop a container.. you can run $ docker container ls to get your CONTAINER ID