FROM ubuntu:jammy
LABEL authors="guotianyu"
COPY build/native/libs/graalvm-demo-0.0.1-SNAPSHOT.jar /app.jar
CMD ["java -jar app.jar"]