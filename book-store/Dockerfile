FROM adoptopenjdk/openjdk11
ARG JAR_FILE=/build/libs/book-store-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} application.jar
ENTRYPOINT ["java","-jar","/application.jar"]
#ENTRYPOINT ["java"]
#ENTRYPOINT ["-jar","/application.jar"]