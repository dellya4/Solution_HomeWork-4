# README

## Description
This project demonstrates the implementation of two structural design patterns:

1. **Singleton** – used to create a global `ConfigurationManager` that provides centralized management of application parameters.
2. **Adapter** – used to integrate the legacy chat service `LegacyChatService` into the new `ChatService` via the `ChatServiceAdapter` class.

---

## File Description

### Part 1: Configuration Manager
- `ConfigurationManager.java` – implements the Singleton pattern to manage application configurations.
- `ConfigManagerDemo.java` – a demonstration class that tests the functionality of `ConfigurationManager`.

### Part 2: Chat Service Adapter
- `LegacyChatService.java` – represents an outdated chat system.
- `ChatService.java` – defines a new interface for the chat system.
- `ChatServiceAdapter.java` – acts as an adapter to ensure compatibility between `LegacyChatService` and `ChatService`.
- `ChatAdapterDemo.java` – a demonstration class to verify the adapter’s functionality.

---

## Launch Instructions

### Compilation

1. Open the terminal and navigate to the root folder of the project.
2. Compile all files:
   ```sh
   javac src/config/*.java src/chat/*.java -d out
   ```

### Execution

1. Launching the Configuration Manager:
   ```sh
   java -cp out config.ConfigManagerDemo
   ```
   **Expected output:**
   ```
   maxPlayers: 100
   defaultLanguage: en
   gameDifficulty: medium
   ```

2. Starting the chat service adapter:
   ```sh
   java -cp out chat.ChatAdapterDemo
   ```
   **Expected output:**
   ```
   Legacy Chat: Hello world!
   ```

---

## Author
**Second-year student:** Adel Abdrakhmanova

