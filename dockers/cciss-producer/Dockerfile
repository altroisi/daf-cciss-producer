FROM openjdk:8-jre-alpine

ENV BUILD_VERSION=0.0.1-SNAPSHOT

ADD ./target/cciss-producer-${BUILD_VERSION}.jar cciss-producer/cciss-producer.jar
ADD ./dockers/cciss-producer/wsccissit.crt cciss-producer/wsccissit.crt

RUN keytool -noprompt -storepass changeit -import -alias cciss -keystore $JAVA_HOME/lib/security/cacerts -file cciss-producer/wsccissit.crt

ARG CONFIG_LOCATION

CMD java -jar cciss-producer/cciss-producer.jar --spring.config.location=${CONFIG_LOCATION}
