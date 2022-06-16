FROM openjdk:11
EXPOSE 8082
ADD target/leaderboard.jar leaderboard.jar
ENTRYPOINT ["java","-jar","/leaderboard.jar"]