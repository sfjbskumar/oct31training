Create project

This is springboot project, here for adding the dependencies we are using the offical website of Spring Initiziers(https://start.spring.io).
After addding this we get Maven to load, now to build the project run 'mvn clean install' cmd and for running the application run 'mvn spring-boot:run'.
For performing the testing on application we use localhost:portnumber(8080/8081,etc) either write this on browser or on POSTMAN.


Build the project

mvn clean install

Run application

mvn spring-boot:run

Testing the application

using POSTMAN or BROSWER

1.Creating Applicant (Admin's operation)
POST

http://localhost:8081/create/applicant
Accept: application/json Content-type: application/json Body:

{
"id":107,
"name":"Sisha",
"age":62,
"balance":109000,
"mobile":"9888995522",
"empStatus":"R",
"pensionStatus":"N",
"pensionMMYY":"0922",
"installment":1020
}

2.Editing Applicant details (Admin's operation)
POST

http://localhost:8081/edit/applicant
Accept: application/json Content-type: application/json Body:

{
"id":107,
"name":"Sisha",
"age":62,
"balance":109000,
"mobile":"9888995522",
"empStatus":"R",
"pensionStatus":"N",
"pensionMMYY":"0922",
"installment":1020
}

3.Approve the pension application if empStatus is R, i.e., retired (Admin's operation)
POST

http://localhost:8081/approve/107
4.Issue Pensions for all Retired employees (Admin's operation)
POST

http://localhost:8081/issuePension
5.Load Pensions for all Active employees (Admin's operation)
POST

http://localhost:8081/loadPension
6. Check Balance (User's operation)
   GET

http://localhost:8081/checkBalance/107
7. Check Status (User's operation)
   GET

http://localhost:8081/checkStatus/107
8. Check Application Information (User's operation)
   GET

http://localhost:8081/checkApplication/107
Extra operations for testing
Fetch All Applications GET

http://localhost:8081/get/applicants
Delete application DELETE

http://localhost:8081/delete/applicant/101