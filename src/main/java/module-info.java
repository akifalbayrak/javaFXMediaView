module com.example.javafxmediaview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxmediaview to javafx.fxml;
    exports com.example.javafxmediaview;
}