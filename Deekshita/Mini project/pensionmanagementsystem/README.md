[# Final Project(Pension Management System)

# Creating Project
1.Go to Spring initializer By selecting Java Version,Maven and Dependencies.
2.Extract the file 
3.Clone it
 
# Creating Pom.xml
 Using Dependencies

```bash
spring-boot-starter-web
spring-boot-starter-security
mysql-connector-java
spring-boot-starter-data-jpa
spring-boot-starter-test
spring-security-test
junit-jupiter-api..
```
# Building Project

```bash
mvn clean install
```
# Run Project

#run the mysql file in docker hub using
```bash
docker-compose -f docker-compose-mysql.yml up -d
```
and then do
```bash
mvn spring-boot:run
```
# Dockerization

open the terminal and  do

```bash
mysql -uuse -ppassword
show databases;
use db;
show tables;
select*from pensiondetails;
```
# Testing applications

# 1. Create Application

## Post
```bash
http://localhost:8082/create/applicant
```
## With Authorization

```bash
Username:-admin123
Password:-password
```

##with body
```bash
{   "id":200,
    "name":"Deekshita",
    "age":21,
    "balance":10000,
    "mobile":"9876455",
    "empStatus":"A",
    "pensionStatus":"N",
    "pensionMMYY":"0922",
    "installment":980
   
    }
```

# Check Balance with Id

## Get
```bash
http://localhost:8082/checkBalance/200
```
# Check status with Id

## GEt
```bash
http://localhost:8082/checkStatus/200
```
# Check application Info

##Get
```bash
http://localhost:8082/checkApplication/107
```
# Issue pension
```bash
http://localhost:8082/issuePension

Username:-admin123
Password:-password
```
# Load Pension
```bash
http://localhost:8082/loadPension

Username:-admin123
Password:-password
```

## Finally Run command

```bash
mvn install dockerfile:build
```