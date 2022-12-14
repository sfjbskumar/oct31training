# Pension Management System 
It based on Java microservices

# Create project

``` 
https://start.spring.io/
```

# Build the project

``` 
mvn clean install
```

# Run application

``` 
mvn spring-boot:run
```

# Starting MySql server in docker
Add docker-compose-mysql.yml file in project
``` 
docker-compose -f docker-compose-mysql.yml up -d
```

# Dockerization of Application
1.To build docker image of application
``` 
mvn install dockerfile:build
```
2.To login to docker account
```
docker login
```
3.To create docker repository
```
docker tag <yourdockerID>/pension-management-system<yourdockerID>/<dockerreponame>
```
4.To push application to docker
```
docker push <yourdockerID>/pension-management-system
```

# Testing the application 
(Using Postman)
# 1.Creating Applicant (Admin's operation)
POST
```
http://localhost:8082/create/applicant
```
Authorization(for admin role):-
```
Username:-admin123
Password:-password
```
Accept: application/json Content-type: application/json Body:
```
{
"id":208,
"name":"PPS",
"age":61,
"balance":5000,
"mobile":"7899995522",
"empStatus":"R",
"pensionStatus":"Y",
"pensionMMYY":"1022",
"installment":500
}
```
# 2.Issue Pensions for all Retired employees (Admin's operation)
POST
```
http://localhost:8082/issuePension
```
Authorization(for admin role):-
```
Username:-admin123
Password:-password
```
# 3.Load Pensions for all Active employees (Admin's operation)
POST
```
http://localhost:8082/loadPension
```
Authorization(for admin role):-
```
Username:-admin123
Password:-password
```
# 4.Check Balance (User's operation)
GET
```
http://localhost:8082/checkBalance/1
```
# 5.Check Status (User's operation)
GET
```
http://localhost:8082/checkStatus/208
```
# 6.Check Application Information (User's operation)
GET
```
http://localhost:8082/checkApplication/208
```