# Spring Boot Security Jwt Authentication (user-jwt-login-service)
This is a project to provide an example on how to add JWT token authentication in a spring boot application. There service will return login token for user name and password which can be used as REST service for validating users and authorization.


The project uses maven as a build tool and also sample script to run on application startup so that anybody can get started by simply running UserJwtServiceApplication.java
 
## Technology Used

 1. Spring Boot (2.1.7.RELEASE)
 2. JWT (0.9.1)
 3. H2 Database (default dev profile) [MySql – Production profile]
 4. Java 1.8


## API Details
API Name  - ** Token Generation **

URL - `` localhost:8080/token/generate-token ``

Method - ** POST **

Header - ```Content-Type: application/json```

Body -

	{
		"username":"alex123",
		"password":"alex123"
	}

Response :

	{
	    "status": 200,
	    "message": "success",
	    "result": {
	        "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbGV4MTIzIiwic2NvcGVzIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpc3MiOiJodHRwOi8vZGV2Z2xhbi5jb20iLCJpYXQiOjE1NDEwNjIzOTMsImV4cCI6MTU0MTA4MDM5M30.DMoB5kv72X7Jf-U5APdjK3UUcGomA9NuJj6XGxmLyqE",
	        "username": "alex123"
	    }
	}
	
API Name  - ** List User **

URL - `` http://localhost:8080/users ``

Method - ** Get **

Header - ```Content-Type: application/json```

Authorization : ``` Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbGV4MTIzIiwic2NvcGVzIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpc3MiOiJodHRwOi8vZGV2Z2xhbi5jb20iLCJpYXQiOjE1NDEwNjIzOTMsImV4cCI6MTU0MTA4MDM5M30.DMoB5kv72X7Jf-U5APdjK3UUcGomA9NuJj6XGxmLyqE```
    
Response -

	 {
	    "status": 200,
	    "message": "User list fetched successfully.",
	    "result": [
	        {
	            "id": 1,
	            "firstName": "Alex",
	            "lastName": "Knr",
	            "username": "alex123",
	            "salary": 3456,
	            "age": 33
	        },
	        {
	            "id": 2,
	            "firstName": "Tom",
	            "lastName": "Asr",
	            "username": "tom234",
	            "salary": 7823,
	            "age": 23
	        },
	        {
	            "id": 3,
	            "firstName": "Adam",
	            "lastName": "Psr",
	            "username": "adam",
	            "salary": 4234,
	            "age": 45
	        }
	    ]
	}

API Name  - ** Create User **

URL - `` http://localhost:8080/users ``

Method - ** POST **

Header - ```Content-Type: application/json```

Authorization : ``` Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbGV4MTIzIiwic2NvcGVzIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpc3MiOiJodHRwOi8vZGV2Z2xhbi5jb20iLCJpYXQiOjE1NDEwNjIzOTMsImV4cCI6MTU0MTA4MDM5M30.DMoB5kv72X7Jf-U5APdjK3UUcGomA9NuJj6XGxmLyqE ```

Body -

	{
		"username":"test",
		"password":"test",
		"firstName":"test",
		"lastName":"test",
		"age":23,
		"salary":12345
	}

Response -

	{
	    "status": 200,
	    "message": "User saved successfully.",
	    "result": {
	        "id": 4,
	        "firstName": "test",
	        "lastName": "test"",
	        "username": "test",
	        "salary": 12345,
	        "age": 23
	    }
	}


API Name  - ** Update User **

URL - `` http://localhost:8080/users/4 ``

Method - ** PUT **

Header - ```Content-Type: application/json```

Authorization : ``` Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbGV4MTIzIiwic2NvcGVzIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpc3MiOiJodHRwOi8vZGV2Z2xhbi5jb20iLCJpYXQiOjE1NDEwNjIzOTMsImV4cCI6MTU0MTA4MDM5M30.DMoB5kv72X7Jf-U5APdjK3UUcGomA9NuJj6XGxmLyqE ```

Body -

	{
		"username":"test1",
		"password":"test1",
		"firstName":"test1",
		"lastName":"test1",
		"age":24,
		"salary":12345
	}

Response -

	{
	    "status": 200,
	    "message": "User updated successfully.",
	    "result": {
	        "id": 0,
	        "firstName": "test1",
	        "lastName": "test1",
	        "username": "test1",
	        "password": "test1",
	        "age": 24,
	        "salary": 12345
	    }
	}
	

API Name  - ** Delete User **

URL - `` http://localhost:8080/users/4 ``

Method - ** DELETE **

Header - ```Content-Type: application/json```

Authorization : ``` Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbGV4MTIzIiwic2NvcGVzIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpc3MiOiJodHRwOi8vZGV2Z2xhbi5jb20iLCJpYXQiOjE1NDEwNjIzOTMsImV4cCI6MTU0MTA4MDM5M30.DMoB5kv72X7Jf-U5APdjK3UUcGomA9NuJj6XGxmLyqE ```

Response -

	{
	    "status": 200,
	    "message": "User deleted successfully.",
	    "result": null
	}