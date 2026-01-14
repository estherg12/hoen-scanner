# Hoen Scanner 🐚

This repository contains a Java-based microservice built using the **Dropwizard** framework. It was developed as part of a Skyscanner software engineering simulation to manage hotel and rental car search results for the Hoen Archipelago.

## Project Overview

The Hoen Scanner acts as a decoupled microservice within the Skyscanner ecosystem. Instead of a monolithic architecture where all code lives in one place, this system uses microservices that communicate over HTTP. [cite_start]This makes the system easier to scale, maintain, and update.

When a user searches for a city, the Skyscanner backend sends a POST request to this service. [cite_start]The service then parses local data files to return matching results.

## Features Implemented
- **Data Modeling**: Created `Search` and `SearchResult` classes to handle JSON serialization and deserialization using the Jackson library.
- **REST Endpoint**: Implemented a `/search` POST endpoint that filters results based on city names.
- **Data Integration**: The service automatically loads data from `hotels.json` and `rental_cars.json` upon startup.

## Getting Started

### Prerequisites
- **Java JDK 19**
- **Maven** (managed via IntelliJ IDEA)
- **Postman** (for testing the API)

### Running the Application
1. Open the project in IntelliJ IDEA.
2. Ensure the Maven project is loaded and dependencies are synced.
3. Set the Program Arguments to `server config.yml` in your Run Configuration.
4. Click the **Green Play Arrow** to start the server.

### Testing the Service
Send a POST request to `http://localhost:9000/search` with the following JSON body in Postman:

```json
{
  "city": "petalborough"
}
```

## 🔗 Useful Resources
* [Microservices Architecture Guide](https://microservices.io/)
* [Dropwizard Documentation](https://www.dropwizard.io/en/latest/manual/index.html)
* [Jackson JSON Annotations Guide](https://github.com/FasterXML/jackson-annotations)
* [Skyscanner Design System (Backpack)](https://backpack.github.io/)

