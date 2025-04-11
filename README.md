# Spring-Quiz-Application
A Spring Boot application for managing quizzes, using MySQL for storage. The application is built and run using a Dockerfile.

# Tech Stack
- Spring Boot
- Spring Data JPA
- MySQL Database
- Gradle Build Tool
- Docker

# How to run
1. Clone the repository
2. In application.properties file give you DB credentials and change accordingly
3. Build the project - using ./gradlew build
     - This will generate a JAR file in the build/libs directory
4. Now, build docker image using command
     - docker build -t image-name-you-want-to-provide .
5. run the container using command
     - docker run -p 8080:8080 use-the-image-name-you-provided-above

# Note
- Make sure which build tool you are using and build the project accordingly like maven, gradle.
- Make sure MySQL is running on your local machine and accessible on port 3306.
- Use host.docker.internal only if you're on Docker Desktop (Windows/macOS).
- If you're on Linux, replace host.docker.internal with 172.17.0.1 or your host IP.
   
