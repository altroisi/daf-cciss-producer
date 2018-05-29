## CCISS Event Producer for DAF

From the project root, compile the java project with 

`mvn clean install`

then build the docker image:

`docker build -t cciss-producer:0.0.1 -f dockers/cciss-producer/Dockerfile .`

Note that you must pass CONFIG_LOCATION as env property when run the image. See [config/application.properties](config/application.properties)

