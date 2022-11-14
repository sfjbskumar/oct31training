# Build
mvn clean install

# Run Reciever
mvn spring-boot:run


# Run Caller

mvn spring-boot:run

# Test for receiver
curl --location --request GET 'localhost:10082/receiver/get'

# Test from caller to receiver

curl --location --request GET 'localhost:10081/caller/get'