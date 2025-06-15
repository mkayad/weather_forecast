# # # # # # # # # # # # # # # # # # # ## # # # # # # # # ## # # # # # # # # #
FROM eclipse-temurin:21-jre-alpine

EXPOSE 8080
ARG WEATHER_API_KEY
ENV weather.api.key=$WEATHER_API_KEY
RUN echo "WEATHER_API_KEY: $WEATHER_API_KEY"

ADD build/libs/weather.jar weather.jar

ENTRYPOINT ["java","-jar","weather.jar"]
