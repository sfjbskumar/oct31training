# Create project

``` 
https://start.spring.io/
```

# Build the project

``` 
mvn clean install
```

#Starting MySql server in docker using(check docker-compose-mysql.yml file in project then use this command)
``` 
docker-compose -f docker-compose-mysql.yml up -d
```

# Run application
``` 
mvn spring-boot:run
```

# Testing the application

(Using Postman)

# 1.Creating Applicant (Admin's operation)
POST 
``` 
http://localhost:8081/create/applicant
``` 
Accept: application/json
Content-type: application/json
Body:
``` 
{
    "id": 107,
    "name": "Alisha",
    "age": 22,
    "balance": 11990,
    "mobile": "9949586034",
    "empStatus": "A",
    "pensionStatus": "N",
    "pensionMMYY": "0822",
    "installment": 1000
}
``` 

# 2.Editing Applicant details (Admin's operation)
POST
```
http://localhost:8081/edit/applicant
```
Accept: application/json
Content-type: application/json
Body:
``` 
{
    "id": 107,
    "name": "Alisha",
    "age": 22,
    "balance": 11990,
    "mobile": "9949586034",
    "empStatus": "A",
    "pensionStatus": "N",
    "pensionMMYY": "0822",
    "installment": 1000
}
``` 
# 4.Issue Pensions for all Retired employees (Admin's operation)
POST
``` 
http://localhost:8081/issuePension
``` 
Authorization(because we gave this operation as admin role):-
``` 
Username:-admin123
Password:-password
``` 


# 5.Load Pensions for all Active employees (Admin's operation)
POST
``` 
http://localhost:8081/loadPension
``` 
Authorization(because we gave this operation as admin role):-
``` 
Username:-admin123
Password:-password
``` 

# 6. Check Balance (User's operation)
GET 
``` 
http://localhost:8081/checkBalance/107
``` 


# 7. Check Status (User's operation)
GET
``` 
http://localhost:8081/checkStatus/107
``` 


# 8. Check Application Information (User's operation)

GET
``` 
http://localhost:8081/checkApplication/107
``` 

Step 6:-

#Dockerization of application(Check for Dockerfile in project then run this command)
``` 
mvn install dockerfile:build
``` 
 