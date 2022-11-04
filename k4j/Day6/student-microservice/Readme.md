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

# Testing the application
Save Data:

curl --location --request POST 'localhost:8081/save/student' \
--header 'Content-Type: application/json' \
--data-raw '{
"rollNo":"134",
"name":"stud1",
"std":"5th"
}'

Get data:
curl --location --request GET 'localhost:8081/get/student?name=stud1'

Update data:

curl --location --request PUT 'localhost:8081/update/student?name=stud1&std=5th'

Remove Data:

curl --location --request DELETE 'localhost:8081/remove/student?name=stud1'
