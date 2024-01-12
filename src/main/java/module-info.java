module org.example.provamioprogetto {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.provamioprogetto to javafx.fxml;
    exports org.example.provamioprogetto;
}