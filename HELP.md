# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.0/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.0/gradle-plugin/packaging-oci-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.0/reference/web/servlet.html)
* [Apache Freemarker](https://docs.spring.io/spring-boot/3.5.0/reference/web/servlet.html#web.servlet.spring-mvc.template-engines)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)


# docker
docker build -t weather .

# Build for a specific platform
docker buildx build -t weather --platform linux/amd64 .

docker buildx build -t weather --platform linux/amd64 --build-arg  WEATHER_API_KEY=$WEATHER_API_KEY .

with an arg --build-arg BUILD_DATE=$(date +%Y-%m-%d)
docker run -d -p 8080:8080 weather

# Azure
create a container registry resource
go to settings/access keys and enable admin user
get the user, pwd, url
# Login 
az login
docker login apppregistry2025.azurecr.io
docker image ls
# Build 
docker tag weather:latest apppregistry2025.azurecr.io/weather:latest

docker tag weather:latest apppregistry2025.azurecr.io/weather:latest
docker push  apppregistry2025.azurecr.io/weather:latest