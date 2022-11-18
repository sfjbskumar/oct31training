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
http://localhost:8085/create/applicant
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
    
"id":"10",

"name":"Lalitha",

"age":"20",

"BalanceAmount":"10000",

"phoneNo":"98765432",

"PensionStatus":"Active",

"pensionmmyy":"may",

"installment":"10000",

"empStatus":"Active"

}
``` 


# 4.Issue Pensions for all Retired employees (Admin's operation)
POST
``` 
http://localhost:8085/issuePension
``` 
Authorization(Need because we gave this operation as admin role):-
``` 
Username:-admin123
Password:-password
``` 


# 5.Load Pensions for all Active employees (Admin's operation)
POST
``` 
http://localhost:8085/loadPension
``` 
Authorization(Need because we gave this operation as admin role):-
``` 
Username:-admin123
Password:-password
``` 

# 6. Check Balance (User's operation)
GET 
``` 
http://localhost:8085/checkBalance/1
``` 


# 7. Check Status (User's operation)
GET
``` 
http://localhost:8085/checkStatus/1
``` 


# 8. Check Application Information (User's operation)

GET
``` 
http://localhost:8085/checkApplication/1
``` 

Step 6:-

#Dockerization of application(Check for Dockerfile in project then run this command)
``` 
mvn install dockerfile:build
```
