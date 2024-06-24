FROM registry.cn-chengdu.aliyuncs.com/guoty/jdk17:latest
LABEL authors="guotianyu"
WORKDIR /tmp
COPY build/libs/graalvm-demo-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 28081
# 执行命令
ENTRYPOINT ["java","-jar","/app.jar"]
