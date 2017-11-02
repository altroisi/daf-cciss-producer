FROM openjdk:8-jre
ADD ./target/cciss-producer-0.0.1-SNAPSHOT.jar /usr/local/cciss-producer/
ADD ./dockers/cciss-producer/wsccissit.crt /usr/local/cciss-producer/wsccissit.crt

RUN keytool -noprompt -storepass changeit -import -alias cciss -keystore $JAVA_HOME/lib/security/cacerts -file /usr/local/cciss-producer/wsccissit.crt

ENV KAFKA_TOPIC=
ENV WS_USER=
ENV WS_PASS=

RUN cd /usr/local/cciss-producer
CMD java -jar /usr/local/cciss-producer/cciss-producer-0.0.1-SNAPSHOT.jar --kafka.topic=$KAFKA_TOPIC --client.username=$WS_USER --client.password=$WS_PASS
