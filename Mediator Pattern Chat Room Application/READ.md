# Chat Room Application

This is an implementation of a **Chat Room Application** using the **Mediator Pattern**. The system allows users to send messages to each other through a central mediator (the chat room).

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
- [How It Works](#how-it-works)
- [Usage](#usage)
- [Classes Overview](#classes-overview)
- [License](#license)

## Features

- Centralized communication through a mediator (chat room).
- Support for different types of users (Regular and Premium).
- Users can send and receive messages without knowing each other's details.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor (e.g., IntelliJ IDEA, Eclipse, Visual Studio Code)

### Installation

1. Clone the repository or download the code files.
   ```bash
   git clone <repository-url>
How It Works
The application consists of a ChatRoom class that acts as a mediator. Users can send messages through the chat room, which then forwards the messages to other users. Each user can be a regular user or a premium user, and both types communicate through the same mediator.