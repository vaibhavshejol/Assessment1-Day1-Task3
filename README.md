# Assessment1-Day1-Task3
# Calculate API Using Executive Framework
This Spring Boot application provides a RESTful API for performing various mathematical calculations asynchronously using an executor framework.

# Features
Asynchronous calculation of:
Square
Cube
Even check
Prime check
Armstrong number check
Palindrome check
Factorial
Reverse of a number
Executor service configuration for parallel execution of tasks

# Technologies Used
Java
Spring Boot
SLF4J for logging
Maven for dependency management

# Setup Instructions
Prerequisites
Java Development Kit (JDK) installed (version 8 or higher)
Maven installed
Running the Application
Clone the repository:

bash
Copy code
git clone https://github.com/your/repository.git
cd CalculateAPIUsingExecutiveFramwork
Build the project using Maven:

bash
Copy code
mvn clean package
Run the application:

bash
Copy code
java -jar target/CalculateApiUsingExecutiveFramworkApplication.jar
Alternatively, you can run the application directly from your IDE by executing the main method in CalculateApiUsingExecutiveFramworkApplication.

Access the API endpoints using Postman or any HTTP client.

# Endpoints
Calculate Endpoint
POST /calculate/{number}
Calculates various operations for the specified {number} asynchronously:
Square
Cube
Even check
Prime check
Armstrong number check
Palindrome check
Factorial
Reverse of a number
Shutdown Endpoint
POST /shutdown
Initiates shutdown of the executor service.
# Logging
Logging is implemented using SLF4J with logback configuration.
Logs provide detailed information about each calculation operation and any encountered exceptions.
# Shutdown
Use the /shutdown endpoint to gracefully shut down the executor service when it's no longer needed.
Contributing
Contributions are welcome! Fork the repository and submit a pull request with your improvements.