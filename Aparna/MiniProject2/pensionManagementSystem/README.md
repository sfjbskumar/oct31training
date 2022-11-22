# Create project
``` 
1.Using Spring Intilizer(by giving all requirement we need like version of java,maven, dependecny etc.)
2.Download zip file of that requirment given and Extract zip file
3.open extracted file in Intellij
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
http://localhost:8082/create/applicant
``` 
Authorization(Need because we gave this operation as admin role):-
``` 
Username:-admin123
Password:-password
``` 
Accept: application/json
Content-type: application/json
Body:
``` 
{
    "id":22,
    "name":"aparna",
    "age":42,
    "balance":1000,
    "mobile":"6888995522",
    "empStatus":"R",
    "pensionStatus":"Y",
    "pensionMMYY":"1022",
    "installment":100
}
``` 


# 2.Issue Pensions for all Retired employees (Admin's operation)
POST
``` 
http://localhost:8082/issuePension
``` 
Authorization(Need because we gave this operation as admin role):-
``` 
Username:-admin123
Password:-password
``` 


# 3.Load Pensions for all Active employees (Admin's operation)
POST
``` 
http://localhost:8082/loadPension
``` 
Authorization(Need because we gave this operation as admin role):-
``` 
Username:-admin123
Password:-password
``` 

# 4. Check Balance (User's operation)
GET
``` 
http://localhost:8082/checkBalance/107
``` 


# 5. Check Status (User's operation)
GET
``` 
http://localhost:8082/checkStatus/107
``` 


# 6. Check Application Information (User's operation)

GET
``` 
http://localhost:8082/checkApplication/107
``` 

Step 6:-

#Dockerization of application(Check for Dockerfile in project then run this command)
``` 
mvn install dockerfile:build
```

