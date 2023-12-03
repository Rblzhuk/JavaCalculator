module com.example.javacalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.javacalculator to javafx.fxml;
    exports com.example.javacalculator;
}