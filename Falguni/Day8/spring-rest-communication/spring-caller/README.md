## Build
mvn clean install

## Run

### spring-receiver
mvn spring-boot:run
### spring-caller
mvn spring-boot:run

## Test the code
curl --location --request GET 'localhost:10081/caller/get'
curl --location --request POST 'localhost:10081/caller/post'
curl --location --request PUT 'localhost:10081/caller/put'
curl --location --request DELETE 'localhost:10081/caller/delete'