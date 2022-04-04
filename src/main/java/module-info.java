module com.example.ed_project2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ed_project2 to javafx.fxml;
    exports com.example.ed_project2;
}