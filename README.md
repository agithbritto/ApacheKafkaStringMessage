# ApacheKafkaStringMessage
Springboot Apache Kafka Application to send String messages

Hit this API
http://localhost:8080/api/v1/kafka/publish?message=HelloAjithBrittoUpdated

Producer will be invoked which will send message to the broker .
Consumer consumes the message from broker and writes a log .

To start zookeeper in windows
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
To start kafka in windows
.\bin\windows\kafka-server-start.bat .\config\server.properties
