module fr.melvinxalexis.machineslotproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens fr.melvinxalexis.machineslotproject to javafx.fxml;
    exports fr.melvinxalexis.machineslotproject;
    exports fr.melvinxalexis.machineslotproject.controllers;
    opens fr.melvinxalexis.machineslotproject.controllers to javafx.fxml;
}