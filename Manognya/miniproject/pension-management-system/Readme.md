#Create Project
create the project structure using Spring Initializr : https://start.spring.io/

#Build Project
After creating Pension.java,PensionRepository,PensionController and PensionService run the project:
mvn clean install

#Run Project
mvn spring-boot:run

#Dockerization
docker-compose -f docker-compose-mysql.yml up -d

#Testing via Postman

Admin's operation:

1)create applicant-POST : http://localhost:8082/create/applicant
Body format Json
{
    "id":112,
    "name":"Rajesh",
    "age":62,
    "balance":1000,
    "mobile":"9888995522",
    "empStatus":"R",
    "pensionStatus":"Y",
    "pensionMMYY":"1022",
    "installment":100
}


2)Issue Pension for retired employees  with empStatus R and PensionStatus Y
GET : http://localhost:8082/issuePension

3)Load pension for active employees with empStatus A and PensionStatus N
GET : http://localhost:8082/loadPension



User's operations:

1)check Status 
GET : http://localhost:8082/checkStatus/112

2)check Balance
GET : http://localhost:8082/checkBalance/112