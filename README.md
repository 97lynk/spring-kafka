# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/#build-image)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#messaging.kafka)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#web)
* [Baeldung Spring Kafka](https://www.baeldung.com/spring-kafka)

### Guides

## Start various docker services

```cmd
docker-compose up -d
```

## Create a topic
Browse to `http://localhost:9000

Add a cluster
![img.png](img.png)`

Create `chat` topic
![img_1.png](img_1.png)

## Start Spring boot Application

```cmd
mvn spring-boot:run
```

## Stop and clean
Ctrl+C to stop mvn command

To clean docker service, Ctrl+C and run
```cmd
docker-compose down
```