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

/**
 * La classe LoginPopup gère la fenêtre de connexion de l'application.
 * Elle permet à l'utilisateur de se connecter ou de s'inscrire.
 */
public class LoginPopup {

    private Stage stage;
    private TextField usernameField;
    private String username;
    private PasswordField passwordField;
    private NoSqlConnector noSqlConnector;

    /**
     * Constructeur de la classe LoginPopup.
     * Initialise la fenêtre de connexion avec les champs nécessaires.
     */
    public LoginPopup() {
        stage = new Stage();
        stage.setTitle("Login");
        stage.initModality(Modality.APPLICATION_MODAL); // Bloque les interactions avec les autres fenêtres

        noSqlConnector = new NoSqlConnector(); // Initialisation du connecteur NoSql

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        // Étiquette et champ pour le nom d'utilisateur
        Label usernameLabel = new Label("Nom d'utilisateur :");
        GridPane.setConstraints(usernameLabel, 0, 0);

        usernameField = new TextField();
        GridPane.setConstraints(usernameField, 1, 0);

        // Étiquette et champ pour le mot de passe
        Label passwordLabel = new Label("Mot de passe :");
        GridPane.setConstraints(passwordLabel, 0, 1);

        passwordField = new PasswordField();
        GridPane.setConstraints(passwordField, 1, 1);

        // Boutons de connexion et d'inscription
        Button loginButton = new Button("Connexion");
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            if (noSqlConnector.verifyLogin(username, password)) {
                stage.close();
                MachineSlotProject.player = new Player(username,NoSqlConnector.getMoney(username));
                MachineSlotProject.launchMainApplication(); // Lancer l'application principale après une connexion réussie
            } else {
                // Afficher un message d'erreur si la connexion échoue
                System.out.println("Échec de la connexion");
            }
        });
        GridPane.setConstraints(loginButton, 1, 2);

        Button registerButton = new Button("S'inscrire");
        registerButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            if (noSqlConnector.registerUser(username, password, Player.DEFAULT_MONEY)) {
                MachineSlotProject.player = new Player(username, NoSqlConnector.getMoney(username));
                stage.close();
                MachineSlotProject.launchMainApplication();
            } else {
                System.out.println("Échec de l'inscription");
            }
        });
        GridPane.setConstraints(registerButton, 0, 2);

        gridPane.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton, registerButton);

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
    }

    /**
     * Affiche la fenêtre de connexion et attend qu'elle soit fermée.
     */
    public void show() {
        stage.showAndWait(); // Affiche la fenêtre de connexion et attend sa fermeture
    }
}
