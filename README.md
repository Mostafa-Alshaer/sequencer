# Tiny URL Sequencer Service

Welcome to the Tiny URL Sequencer Service repository! This service provides an auto-incrementing sequence of IDs, which is crucial for generating unique and sequential identifiers in the [Tiny URL Training service](https://github.com/Mostafa-Alshaer/tiny-url-training).

## Table of Contents

- [Introduction](#introduction)
- [How It Works](#how-it-works)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)

## Introduction

The Tiny URL Sequencer Service is a standalone microservice implemented in Java using the Spring Boot framework. Its primary purpose is to offer auto-incremented IDs for use in the generation of unique and sequential tiny URLs in the Tiny URL Training service.

## How It Works

1. **Auto-incremented IDs:**
   - The service maintains an auto-incremented sequence of IDs.

2. **ID Retrieval:**
   - Clients interact with the service to obtain the next available ID.

3. **Scalability:**
   - Designed to be scalable, allowing for deployment in multiple instances to handle increased demand.

## Getting Started

To set up the Tiny URL Sequencer Service, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/Mostafa-Alshaer/tiny-url-sequencer-service.git
   ```

2. Install dependencies:
   ```bash
   cd tiny-url-sequencer-service
   ./mvnw clean install
   ```

3. Configure environment variables (if needed).

4. Run the service:
   ```bash
   ./mvnw spring-boot:run
   ```

## Usage

The service exposes an endpoint to retrieve the next available ID:

- **Retrieve Next ID:**
  ```http
  GET /sequencer
  ```

## Contributing

Contributions are welcome! If you have ideas for improvements, encounter issues, or want to add new features, please open an issue or submit a pull request.
