module com.example.meusegundoappjavafxxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.meusegundoappjavafxxml to javafx.fxml;
    exports com.example.meusegundoappjavafxxml;
}