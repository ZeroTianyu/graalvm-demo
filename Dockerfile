FROM ubuntu:jammy
LABEL authors="guotianyu"
COPY build/native/nativeCompile/graalvm-demo /app
CMD ["/app"]