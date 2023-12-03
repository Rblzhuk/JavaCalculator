module com.example.javacalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens Main.javacalculator to javafx.fxml;
    exports Main.javacalculator;
}