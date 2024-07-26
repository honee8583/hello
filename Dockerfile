# 베이스 이미지로 JDK 17 사용
FROM openjdk:17-jdk-slim

# 애플리케이션 JAR 파일의 이름
ARG JAR_FILE=build/libs/*.jar

# 컨테이너 내 작업 디렉토리 설정
WORKDIR /app

# 애플리케이션 JAR 파일을 컨테이너로 복사
COPY ${JAR_FILE} app.jar

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "hello_key=${hello_key}", "app.jar"]
