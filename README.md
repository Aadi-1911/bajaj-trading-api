# Trading API Simulation – Bajaj Broking Assignment

## Overview

This project is a simplified trading backend simulation developed as part of the Bajaj Broking Campus Hiring Assignment.
It demonstrates backend system design, REST API development, and basic trading workflow concepts.

The application exposes REST APIs that allow a user to:
- View available trading instruments
- Place buy/sell orders
- Check order status
- View executed trades
- Fetch current portfolio holdings

This implementation is a simulation only and does not connect to any real trading system or market data.

---

## Technology Stack

- Java 17
- Spring Boot
- Maven
- REST APIs (JSON)
- In-memory data storage
- Swagger (OpenAPI) for API documentation

---

## Application Design

The application follows a simple layered structure:

- Controller Layer: Handles API requests and responses
- Repository Layer: Manages in-memory data storage
- Model Layer: Represents trading domain entities

### Trading Flow

1. User places an order through the Orders API
2. Basic validations are performed
3. Order is executed immediately (simulation)
4. A trade is generated for the executed order
5. Portfolio is updated based on executed trades

All data is stored in memory and is reset when the application restarts.

---

## API Endpoints

### Instruments

GET /api/v1/instruments

---

### Orders

POST /api/v1/orders

Sample request:
{
  "symbol": "INFY",
  "orderType": "BUY",
  "orderStyle": "MARKET",
  "quantity": 2
}

GET /api/v1/orders/{orderId}

---

### Trades

GET /api/v1/trades

---

### Portfolio

GET /api/v1/portfolio

Returned fields:
- symbol
- quantity
- averagePrice

---

## Setup and Run Instructions

### Prerequisites

- Java 17 or higher
- Maven installed

### Steps to Run

1. Clone the repository or extract the project ZIP
2. Navigate to the project root directory
3. Run the application using:

mvn clean spring-boot:run

4. The application starts on:

http://localhost:8080

---

## API Documentation (Swagger)

Swagger is integrated for API exploration and testing.

After starting the application, open:

http://localhost:8080/swagger-ui/index.html

---

## Sample API Usage

Fetch instruments:
curl http://localhost:8080/api/v1/instruments

Place an order:
curl -X POST http://localhost:8080/api/v1/orders -H "Content-Type: application/json" -d '{"symbol":"INFY","orderType":"BUY","orderStyle":"MARKET","quantity":2}'

Fetch trades:
curl http://localhost:8080/api/v1/trades

Fetch portfolio:
curl http://localhost:8080/api/v1/portfolio

---

## Assumptions and Limitations

- Data is stored in memory and resets on application restart
- Authentication is mocked with a single assumed user
- Orders are executed immediately as part of the simulation
- No real-time market pricing is implemented
- Portfolio value calculation is simplified

---

## Notes

This project focuses on API design, structure, and trading workflow simulation as required by the assignment.
It is not intended for production use.
