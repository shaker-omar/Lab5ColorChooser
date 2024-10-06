module org.example.lab5colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.lab5colorchooser to javafx.fxml;
    exports org.example.lab5colorchooser;
}