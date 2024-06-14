package fr.melvinxalexis.machineslotproject;

import fr.melvinxalexis.machineslotproject.controllers.MainFormController;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginPopup {

    private Stage stage;
    private TextField usernameField;
    private String username;
    private PasswordField passwordField;

    public LoginPopup() {
        stage = new Stage();
        stage.setTitle("Login");
        stage.initModality(Modality.APPLICATION_MODAL); // Block interactions with other windows

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        Label usernameLabel = new Label("Username:");
        GridPane.setConstraints(usernameLabel, 0, 0);

        usernameField = new TextField();
        GridPane.setConstraints(usernameField, 1, 0);

        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 1);

        passwordField = new PasswordField();
        GridPane.setConstraints(passwordField, 1, 1);

        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            if (validateLogin(username, password)) {
                stage.close();
                MachineSlotProject.launchMainApplication(); // Launch main application after successful login
            } else {
                // You can show an error message here if login fails
                System.out.println("Login failed");
            }
        });
        GridPane.setConstraints(loginButton, 1, 2);

        gridPane.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton);

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
    }

    public void show() {
        MachineSlotProject.player = new Player(username);
        stage.showAndWait(); // Show the login popup and wait for it to be closed
    }

    private boolean validateLogin(String username, String password) {
        // Replace with your actual verification logic (e.g., database check)
        this.username = username;
        return username.equals("admin") && password.equals("password");
    }
}
