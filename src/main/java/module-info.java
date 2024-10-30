module com.example.l {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.l to javafx.fxml;
    exports com.example.l;
}