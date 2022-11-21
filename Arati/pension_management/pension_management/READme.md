#Pension Management System This project was generated with Java spring-boot.

#Create project https://start.spring.io/ 1.Using Spring Intilizr(Select maven project, language java, spring-boot 2.7.5, packaging jar,java 11) 2.Download zip file with dependencies like web, mysql 3.Extract zip file 4.open extracted file in Intellij

#Build the project mvn clean install

#Run application mvn spring-boot:run

#Starting MySql server in docker Add docker-compose-mysql.yml file in project docker-compose -f docker-compose-mysql.yml up -d

#Dockerization of Application 1.To build docker image of application mvn install dockerfile:build 2.To login to docker account docker login 3.To create docker repository docker tag /pension-management-system/ 4.To push application to docker docker push /pension-management-system

#Testing the application(Using Postman)

1.Creating Applicant (Admin's operation) POST

http://localhost:8082/create/applicant

Authorization(for admin role):- Username:-admin123 Password:-password

Accept: application/json Content-type: application/json Body:

{ "id" : 2, "name":"xyz", "age" :"43", "balance" : "89655", "mobile" :" 09654444", "pensionStatus" :"N", "pensionMMYY":"1022", "installment" : "98", "empStatus": "A" }

2.Issue Pensions for all Retired employees (Admin's operation) POST

http://localhost:8081/issuePension

Authorization(for admin role):- Username:-admin123 Password:-password

3.Load Pensions for all Active employees (Admin's operation) POST

http://localhost:8081/loadPension

Authorization(for admin role):- Username:-admin123 Password:-password

4.Check Balance (User's operation) GET

http://localhost:8081/checkBalance/1
#Pension Management System This project was generated with Java spring-boot.

#Create project https://start.spring.io/ 1.Using Spring Intilizr(Select maven project, language java, spring-boot 2.7.5, packaging jar,java 11) 2.Download zip file with dependencies like web, mysql 3.Extract zip file 4.open extracted file in Intellij

#Build the project mvn clean install

#Run application mvn spring-boot:run

#Starting MySql server in docker Add docker-compose-mysql.yml file in project docker-compose -f docker-compose-mysql.yml up -d

#Dockerization of Application 1.To build docker image of application mvn install dockerfile:build 2.To login to docker account docker login 3.To create docker repository docker tag /pension-management-system/ 4.To push application to docker docker push /pension-management-system

#Testing the application(Using Postman)

1.Creating Applicant (Admin's operation) POST

http://localhost:8082/create/applicant

Authorization(for admin role):- Username:-admin123 Password:-password

Accept: application/json Content-type: application/json Body:

{ "id":1, "name":"Anvi", "age":60, "balance":5000, "mobile":"7899995522", "empStatus":"R", "pensionStatus":"Y", "pensionMMYY":"1022", "installment":500 }

2.Issue Pensions for all Retired employees (Admin's operation) POST

http://localhost:8081/issuePension

Authorization(for admin role):- Username:-admin123 Password:-password

3.Load Pensions for all Active employees (Admin's operation) POST

http://localhost:8081/loadPension

Authorization(for admin role):- Username:-admin123 Password:-password

4.Check Balance (User's operation) GET

http://localhost:8081/checkBalance/1

5.Check Status (User's operation) GET

http://localhost:8081/checkStatus/1

6.Check Application Information (User's operation) GET

http://localhost:8081/checkApplication/1
5.Check Status (User's operation) GET

http://localhost:8081/checkStatus/1

6.Check Application Information (User's operation) GET

http://localhost:8081/checkApplication/1