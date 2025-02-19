# 📦 Inventory Management System with MySQL

A **JavaFX-based Inventory Management System** with **MySQL integration** that allows users to **manage products, track stock, and delete inventory items**.

## 🎯 Features
✅ **Add, Edit, Delete Products**  
✅ **View All Products**  
✅ **Automatically Creates Database Tables**  

---

## 📌 Setup Instructions
### 🔹 1. Install Required Software
- Install **Java 17 or later** [Download](https://www.oracle.com/java/technologies/javase-downloads.html)
- Install **JavaFX SDK** [Download](https://gluonhq.com/products/javafx/)
- Install **MySQL Server & MySQL Workbench** [Download](https://dev.mysql.com/downloads/)

### 🔹 2. Clone This Repository
```sh
git clone https://github.com/HusseinMelhem/InventoryManagementSystem-withMysql.git
cd InventoryManagementSystem-withMysql
🔹 3. Configure MySQL Database
1️⃣ Open MySQL Workbench
2️⃣ Create a new database:

sql
Copy
Edit
CREATE DATABASE IF NOT EXISTS inventory_db;
USE inventory_db;
3️⃣ Run this query to create the products table:

sql
Copy
Edit
CREATE TABLE IF NOT EXISTS products (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    quantity INT NOT NULL,
    price DOUBLE NOT NULL
);
🔹 4. Run the Application
1️⃣ Open Eclipse
2️⃣ Import the project
3️⃣ Run InventoryGUI.java


🔗 Related Projects
[Student Management System with MySQL](https://github.com/HusseinMelhem/StudentManagementSystem-withMysqlImplementation/tree/main)
