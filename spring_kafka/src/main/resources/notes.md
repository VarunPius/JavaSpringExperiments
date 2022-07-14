# Start Zookeeper and Kafka:

## Start Zookeeper:
```
$ zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties
```

## Start Kafka server:
```
$ kafka-server-start /usr/local/etc/kafka/server.properties
```

WARNING:

During server start, you might be facing connection broken issue.
```
[2018-08-28 16:24:41,166] WARN [Controller id=0, targetBrokerId=0] Connection to node 0 could not be established. Broker may not be available. (org.apache.kafka.clients.NetworkClient)
[2018-08-28 16:24:41,268] WARN [Controller id=0, targetBrokerId=0] Connection to node 0 could not be established. Broker may not be available. (org.apache.kafka.clients.NetworkClient)
```

To fix this issue, we need to change the `server.properties` file.
```
$ vim /usr/local/etc/kafka/server.properties
```

Here uncomment the server settings and update the value from
```
listeners=PLAINTEXT://:9092
```
to
```
############################# Socket Server Settings ############################## The address the socket server listens on. It will get the value returned from
# java.net.InetAddress.getCanonicalHostName() if not configured.
#   FORMAT:
#     listeners = listener_name://host_name:port
#   EXAMPLE:
#     listeners = PLAINTEXT://your.host.name:9092
listeners=PLAINTEXT://localhost:9092
```
and restart the server and it will work great.

## Create Kafka Topic:

    A topic is a category or feed name to which records are published. 
    Topics in Kafka are always multi-subscriber; that is, a topic can have zero, one, or many consumers that subscribe to the data written to it.

```
$ kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
```
Here we have created a topic name `test`

## Initialize Producer console:

Now we will initialize the Kafka producer console, which will listen to localhost at port 9092 at topic test :
```
$ kafka-console-producer --broker-list localhost:9092 --topic test
>send first message
>send second message
>wow it is working
```

## Initialize Consumer console:

Now we will initialize the Kafka consumer console, which will listen to bootstrap server localhost at port 9092 at topic test from beginning:
```
$ kafka-console-consumer --bootstrap-server localhost:9092 --topic test --from-beginning
send first message
send second message
wow it is working
```
Congratulations everyone, hopefully it is helpful.