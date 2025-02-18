module StudentManagementSystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql; // Needed for MySQL Connection

    opens inventory.management to javafx.fxml;
    exports inventory.management;
}
