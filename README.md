# Banking_App
Model Classes: The Bank, Branch, and Service classes represent the entities in the database. Bank has a one-to-many relationship with both Branch and Service.

Repository Interfaces: The repository interfaces provide methods to interact with the database.

Service Classes: The service classes contain the business logic to retrieve data from the repositories.

Controller Class: The controller class handles HTTP requests and returns views with the required data.

HTML Templates: The HTML files use Thymeleaf to display the bank name, branch information, and services in a table format.

Main Application Class: The entry point of the Spring Boot application.

Testing
Once the application is running, you can test the two RESTful URLs:

For bank branches: http://localhost:8080/bank/{id}/branches
For bank services: http://localhost:8080/bank/{id}/services

for Mysql Database req-

create database banking_db;
use banking_db;

INSERT INTO branch (city, name, bank_id) VALUES
( 'Bengaluru', 'MG Road', 11),
( 'Bengaluru', 'Koramangala', 11),
( 'Bengaluru', 'Indiranagar', 11),
( 'Bengaluru', 'Whitefield', 11),
( 'Bengaluru', 'Electronic City', 11),
( 'Bengaluru', 'Jayanagar',  11),
( 'Bengaluru', 'Basavanagudi', 11),
( 'Bengaluru', 'Hebbal', 11),
( 'Bengaluru', 'Malleshwaram', 11),
( 'Bengaluru', 'Banashankari', 11);

INSERT INTO bank (name) VALUES
('State Bank of India'),
('Punjab National Bank'),
('HDFC Bank'),
('ICICI Bank'),
('Axis Bank'),
('Bank of Baroda'),
('Canara Bank'),
('Union Bank of India'),
('IndusInd Bank'),
('Kotak Mahindra Bank');

INSERT INTO service (name, bank_id) VALUES
('Savings Account', 11),
('Current Account', 11),
('Fixed Deposit', 11),
('Loan Services', 11),
('Credit Cards', 11),
('Internet Banking', 11),
('Mobile Banking', 11),
('Wealth Management', 11),
('Insurance Services', 11),
('Mutual Funds', 11);
