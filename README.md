# Containerize a [Micronaut](http://micronaut.io/) app with Jib

This is an example of how to easily build a Docker image for a [Micronaut](http://micronaut.io) application with Jib.

## Quickstart

### With Docker

```shell
./gradlew jibDockerBuild

docker run -d -p 8080:8080 micronaut-jib:0.1
```
```shell
curl localhost:8080/hello/Jeff
> Hello Jeff
```

## More information

Learn [more about Jib](https://github.com/GoogleContainerTools/jib).
Learn [more about Micronaut](https://micronaut.io).
