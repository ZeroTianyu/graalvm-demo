FROM openjdk:17
LABEL authors="guotianyu"
WORKDIR /app
COPY build/libs/graalvm-demo-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 28081
# 执行命令
ENTRYPOINT ["java","-jar","/app.jar"]
