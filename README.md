# Book My Show Low Level Design 

Application to book movie tickets online

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Testing](#testing)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction

Implement a movie booking application in spring boot that manages problem of concurrency by using locking and unlocking of a show seat.

## Features

- Low Level Design of Book My Show Application
- Shows Database Connection
- Solves concurrency of multiple bookings

## Prerequisites

Before you begin, ensure you have met the following requirements:

- **Java**: JDK 8 or later installed.
- **Maven**: Apache Maven 3.6.0 or later installed.
- **Git**: Git SCM to clone the repository.

## Installation

1. Clone the repository:
   git clone https://github.com/swapnilshah5889/BookMyShowLLD.git
   cd BookMyShowLLD

2. Build the project using Maven:
   mvn clean package

## Running the Application:

1. Using Maven:
    mvn spring-boot:run

   2. Using the JAR file:
   After building the project, you can run the JAR file:
      java -jar target/BookMyShowLLD-0.0.1-SNAPSHOT.jar

## Testing
   To run tests, use the following command:
   mvn test

## Usage
   curl -X GET http://localhost:8080/api/example

## Contributing
To contribute to this project, follow these steps:

1. Fork the repository.
2. Create a new branch: git checkout -b feature-branch-name
3. Make your changes and commit them: git commit -m 'Add feature'
4. Push to the branch: git push origin feature-branch-name
5. Create a pull request.

