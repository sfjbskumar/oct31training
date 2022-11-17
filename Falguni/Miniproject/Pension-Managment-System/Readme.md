Pension Management System using Java-Spring-Boot

Project By : Falguni Mohite

This project is build as per Java Microservices Architecture. Pension Management System is an user friendly application in which all the information related to user's pension is stored. 
This application is built by using following technologies :
Java
Spring-boot
Mysql
Maeven
Docker

Description of the project :
The following was discovered as part of building this project:
* The original package name 'com.example.Pension Managment System' is invalid and this project uses 'com.example.Pension.Managment.System' instead.
Maeven is used in the project. All the requiredmaeven  dependancies are written in pom.xml. MySQL database is used to handle the data. We have docker-compose-mysql.yml file to create MySQL image on docker. Spring-boot applications use Tomcat Apache servers. We have used REST API to perform CRUD application. We can perform Get, Post, Put and Delete mapping requests to make changes in data. Also many spring-boot annotations are used. 
The URL of the application is :
http://localhost:8081
Application docker image URL is :
https://hub.docker.com/repository/docker/falgunimohite/pension-managment-system

Instructions :
To install dependacies : mvn clean install
To create MySQL image : docker-compose -f docker-compose-mysql.yml up -d
To run the application : mvn spring-boot:run
To build docker image of application : mvn install dockerfile:build
MySQL commands to check data from database(In the terminal of mysql image in docker) :
To login to mysql : mysql -uuser -ppassword
To check all the databases present : show databases ;
To use the database : use db;
To see the table : select * from table_name;


### Reference Documentation
For further reference, please consider the following sections:
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#web)

Guides :
The following guides illustrate how to use some features concretely:
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)















https://hub.docker.com/repository/docker/falgunimohite/pension-managment-system