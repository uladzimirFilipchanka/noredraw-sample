FROM eclipse-temurin:17
EXPOSE 80
COPY ./build/libs/arch-diagram-sample*.jar /app/arch-diagram-sample.jar
ENTRYPOINT java -jar /app/arch-diagram-sample.jar
