# 1) Login Application

The login application consist of 3 folders. 
1) docker
2) reactapp
3) spring-boot-field-validation

# To start the database:
please have docker on your machine before typing the following command.
- Go to the docker folder, in command line, type docker-compose up -d
- The command will fire up a postgres and adminer container. To check on the database data, got to localhost:8081.
- System: PosgreSQL
  Server: postgres
  username: admin
  password: P@ssw0rd
  database: postgres
  
# To start UI, go to reactapp folder, type npm install and npm start after installling the packages required.

# To start the Spring Boot Backend, run the SpringBootFieldValidationApplication.java in your preferred IDE.

# 2) The Encoder

#To start the Encoder, run the Main.java.
It will prompt the user for selection in command line.
1) Encode
2) Decode

For Encode, the user is required to enter PlainText and Offset and encoded value will be displayed.
For Decode, just enter the encoded text and the decoded value will be displayed.
