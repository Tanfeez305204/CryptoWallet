# Project Title: Crypto Wallet API Automation

## Introduction
This project focuses on automating the testing of a Crypto Wallet API. Its core functionality includes user registration, login, and transaction processing. The project addresses the need for secure and reliable testing in the rapidly evolving crypto industry.

## Project Type
Api testing

## Video Walkthrough of the Project
Attach a very short video walkthrough of all features [[(https://youtu.be/RpKhu9PSb8Q)]

## Video Walkthrough of the Codebase
Attach a very short video walkthrough of the codebase [https://youtu.be/RpKhu9PSb8Q]

## Features
- User registration and authentication
- Login
- Transaction processing
- Wallet balance management
- API documentation and reporting

## Design Decisions or Assumptions
- Implemented Page Object Model (POM) for better maintainability.
- Chose Java and TestNG for robust testing capabilities.

## Installation & Getting Started
Follow these steps to install, configure, and run the project:

```bash
npm install my-project
cd my-project
npm start
```

## Usage
To use the project, follow the API documentation for endpoints. For example:

```bash
# Example of registering a user
curl -X POST http://localhost:3000/api/register -d '{"username": "testuser", "Tanfeez305304": "Tanfeez@234"}'
```



## Credentials
- Username: `testuser`
- Password: `password123`

## APIs Used
- Crypto Wallet API: [API Documentation](https://api-docs.example.com)

## API Endpoints
### For Backend Applications
- GET /api/users - Retrieve all users
- POST /api/users/register - Create a new user
- POST /api/transactions - Process a new transaction

## Technology Stack
- Node.js: JavaScript runtime for building server-side applications.
- Express.js: Web framework for Node.js to build APIs.
- MongoDB: NoSQL database for storing user and transaction data.
- Java: For test automation with Appium.
- TestNG: Testing framework for managing test cases.
- Appium: Mobile automation tool for testing.
