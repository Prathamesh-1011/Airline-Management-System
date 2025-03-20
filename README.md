## **✈️ Airline Management System**
A comprehensive airline management system built using **Spring Boot**, designed to manage flight schedules and ticket bookings with robust validation and RESTful APIs.

---

## **🛠️ Features**
✅ Retrieve available flight schedules.  
✅ View detailed information for specific flights.  
✅ Book a new ticket with proper validation checks.  
✅ View ticket details.  
✅ Cancel a ticket.  
✅ Built-in **Swagger UI** for API testing.  
✅ **H2 Database** for lightweight, in-memory data management.  

---

## **📂 Project Structure**
```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── airline
│   │   │           ├── controller
│   │   │           ├── model
│   │   │           ├── repository
│   │   │           ├── service
│   │   │           └── AirlineManagementApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
│   ├── test
│       └── (Test files for unit/integration testing)
├── .gitignore
├── README.md
└── pom.xml
```

---

## **⚙️ Tech Stack**
- **Java 17**  
- **Spring Boot 3.2.0**  
- **Spring Data JPA**  
- **H2 Database**  
- **Swagger (Springdoc)**  
- **Lombok**  

---

## **🚀 Getting Started**

### **1️⃣ Prerequisites**
Ensure you have the following installed:  
- **JDK 17** or higher  
- **Maven 3.8+**  
- IDE such as IntelliJ IDEA, VSCode, or Eclipse  

---

### **2️⃣ Installation**
Clone the repository and navigate to the project directory:  
```bash
git clone https://github.com/your-repo/airline-management-system.git
cd airline-management-system
```

---

### **3️⃣ Build the Project**
Run the following command to compile the project and resolve dependencies:  
```bash
mvn clean install
```

If you face dependency issues, use:  
```bash
mvn clean install -U
```

---

### **4️⃣ Run the Application**
Start the Spring Boot application with:  
```bash
mvn spring-boot:run
```

Expected console message:  
```
Started AirlineManagementApplication in 2.345 seconds (JVM running for 3.012)
```

---

### **5️⃣ API Endpoints**
| Method | Endpoint                     | Description                      |
|---------|-----------------------------|----------------------------------|
| `GET`   | `/flights?sort=asc`         | Get all flights (sorted)         |
| `GET`   | `/flights/{id}`             | Get flight details by ID         |
| `GET`   | `/flights/{id}/schedules?dates=` | Get flight schedules by date(s)  |
| `POST`  | `/tickets`                  | Book a new ticket                |
| `GET`   | `/tickets/{id}`             | Get ticket details by ID         |
| `DELETE`| `/tickets/{id}`             | Cancel a ticket                  |

---

### **6️⃣ Sample JSON Payloads**
✅ **Create Ticket Request**
```json
{
    "passengerName": "Alice Johnson",
    "email": "alice.johnson@example.com",
    "flightId": 1,
    "seatNumber": "C3",
    "status": "ACTIVE"
}
```

✅ **Flight Schedule Response**
```json
{
    "flightNumber": "AI101",
    "origin": "New York",
    "destination": "London",
    "departureTime": "2025-04-01T10:00:00",
    "arrivalTime": "2025-04-01T18:00:00",
    "status": "ON_TIME"
}
```

---

### **7️⃣ Swagger UI for API Testing**
Once the app is running, visit:  
🔗 **[Swagger UI](http://localhost:8080/swagger-ui.html)**  

---

### **8️⃣ H2 Database Console**
To view and manage data directly in the H2 database:  
🔗 **[H2 Console](http://localhost:8080/h2-console)**  

**Connection Details:**  
- **JDBC URL:** `jdbc:h2:mem:testdb`  
- **Username:** `sa`  
- **Password:** *(Leave empty)*  

---

## **🧪 Running Tests**
To execute unit and integration tests:  
```bash
mvn test
```

---

## **🐛 Troubleshooting**
❗ **Port Already in Use:**  
```bash
lsof -i :8080   # Identify process
kill -9 <PID>    # Kill conflicting process
```

❗ **Dependency Issues:**  
```bash
mvn clean install -U
```

❗ **H2 Console Errors:**  
Ensure the JDBC URL is correctly set to:  
```
jdbc:h2:mem:testdb
```

---

## **📜 License**
This project is licensed under the **MIT License**.

---

## **💬 Contact**
For questions or improvements, feel free to reach out. 🚀
