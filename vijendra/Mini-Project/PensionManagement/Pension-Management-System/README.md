Step 1:-

# Create project
``` 
1.Using Spring Intilizer(by giving all requirement we need like version of java,maven, dependecny etc.)
2.Download zip file of that requirment given
3.Extract zip file
4.open extracted file in Intellij
```

Step 2:-

# Build the project
``` 
mvn clean install
```

Step 3:-

#Starting MySql server in docker using(check docker-compose-mysql.yml file in project then use this command)
``` 
docker-compose -f docker-compose-mysql.yml up -d

```

Step 4:-

# Run application
``` 
mvn spring-boot:run
```

Step 5:-

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
    "id":107,
    "name":"vijendra",
    "age":65,
    "balance":116000,
    "mobile":"9978995432",
    "empStatus":"R",
    "pensionStatus":"N",
    "pensionMMYY":"1122",
    "installment":1120
}
``` 


# 4.Issue Pensions for all Retired employees (Admin's operation)
POST
``` 
http://localhost:8082/issuePension
``` 
Authorization(Need because we gave this operation as admin role):-
``` 
Username:-admin123
Password:-password
``` 


# 5.Load Pensions for all Active employees (Admin's operation)
POST
``` 
http://localhost:8082/loadPension
``` 
Authorization(Need because we gave this operation as admin role):-
``` 
Username:-admin123
Password:-password
``` 

# 6. Check Balance (User's operation)
GET 
``` 
http://localhost:8082/checkBalance/107
``` 


# 7. Check Status (User's operation)
GET
``` 
http://localhost:8082/checkStatus/107
``` 


# 8. Check Application Information (User's operation)

GET
``` 
http://localhost:8082/checkApplication/107
``` 

Step 6:-

#Dockerization of application(Check for Dockerfile in project then run this command)
``` 
mvn install dockerfile:build
```

