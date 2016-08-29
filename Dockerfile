FROM java:8

VOLUME /tmp

WORKDIR /app

USER daemon

ADD build/docker/microservice.jar /app/microservice.jar

EXPOSE 8080

#RUN chmod +x /app/microservice.jar
#RUN bash -c 'touch /app/microservice.jar'
CMD [ "java", "-jar", "/app/microservice.jar" ]

