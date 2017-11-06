## Kafka + zookeeper + trifecta 

Docker compose definition that build a simple kafka + zoopkeper instance. This can be used to test the producer. It includes a trifecta instance with the DAF IoT Events decoder (see  [Avro schema](https://github.com/teamdigitale/daf-iotingestion-proof-of-concept/blob/master/src/main/scala/it/teamDigitale/avro/Event.avsc)).

**Note:** 
If you have problems with topics when the container is restarted, use `docker-compose rm` to delete previous images