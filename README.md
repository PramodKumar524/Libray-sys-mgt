# 📚 Library Management System (OOPs Based)

This is a simple **Library Management System** project built using **Core Java & Object-Oriented Programming (OOPs)** concepts.  
The project demonstrates how to structure different classes inside a **single package** and work together to represent a real-world library scenario.

<img width="616" height="581" alt="Screenshot 2025-10-24 210854" src="https://github.com/user-attachments/assets/a70bf69f-f99a-468b-8a16-820a3ee9d703" />

---

## 🛠️ Features

- Proper OOPs structure (Encapsulation & Abstraction)
- Multiple classes in a single package (`library`)
- `Book` class is composed of:
  - `Title`
  - `Author`
  - `Availability`
  - `Price`
- Main class prints book details as sample execution

---

## 📦 Project Structure
src/
└── library/
├── Book.java
├── Title.java
├── Author.java
├── Availability.java
├── Price.java
└── LibraryManagementSystem.java (main class)

---

## 💡 Concepts Used

| OOP Concept    | Usage in Project                                |
|---------------|--------------------------------------------------|
| Encapsulation | Each class hides its data with private fields    |
| Abstraction   | `Book` uses components without exposing inside   |
| Composition   | `Book` is made up of other classes               |
| Single Package| All classes under `library` package              |

---

## ▶️ How to Run

1. Open your IDE (IntelliJ / Eclipse / VS Code)
2. Create a Java project
3. Create a package named `library`
4. Add all `.java` files inside this package
5. Run `LibraryManagementSystem.java` (main class)

---

## ✅ Sample Output
Title : Java Programming<br>
Author : John Doe<br>
Available : Yes<br>
Price : ₹450<br>
Title : Data Structures<br>
Author : Mark Smith<br>
Available : No<br>
Price : ₹550
