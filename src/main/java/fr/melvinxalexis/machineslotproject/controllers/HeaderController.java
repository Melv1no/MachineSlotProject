package fr.melvinxalexis.machineslotproject.controllers;

import fr.melvinxalexis.machineslotproject.MachineSlotProject;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * La classe HeaderController gère les éléments d'interface utilisateur pour l'en-tête de la machine à sous.
 * Elle met à jour les informations du joueur, les statistiques de jeu et les messages d'information.
 */
public class HeaderController {

    @FXML
    public Label GameInformationText; // Label pour afficher des messages d'information sur le jeu.

    @FXML
    private Label PlayerSpinText; // Label pour afficher le nombre de spins du joueur.

    @FXML
    private Label PlayerMoneyText; // Label pour afficher le montant d'argent du joueur.

    @FXML
    private Label PlayerNameText; // Label pour afficher le nom du joueur.

    private static HeaderController instance; // Instance statique pour accéder aux labels depuis d'autres parties du code.

    /**
     * La méthode initialize est appelée automatiquement après le chargement du fichier FXML.
     * Elle initialise les labels avec les informations du joueur.
     */
    @FXML
    public void initialize() {
        instance = this; // Assigner l'instance courante à la variable statique.

        // Initialiser les labels avec les informations actuelles du joueur.
        updatePlayerName();
        updatePlayerMoney();
        updatePlayerSpinCount();
        GameInformationText.setText("Pour commencer, cliquez sur Spin.");
    }

    /**
     * Met à jour le label avec le nom du joueur.
     */
    private void updatePlayerName() {
        if (MachineSlotProject.player != null) {
            PlayerNameText.setText("Player: " + MachineSlotProject.player.getName());
        }
    }

    /**
     * Met à jour le label avec le montant d'argent du joueur.
     */
    private void updatePlayerMoney() {
        if (MachineSlotProject.player != null) {
            PlayerMoneyText.setText("Money: " + MachineSlotProject.player.getTokens());
        }
    }

    /**
     * Met à jour le label avec le nombre de spins du joueur.
     */
    private void updatePlayerSpinCount() {
        if (MachineSlotProject.player != null) {
            PlayerSpinText.setText("Spin: " + MachineSlotProject.player.getTotalSpins());
        }
    }

    /**
     * Met à jour le label PlayerMoneyText avec le montant d'argent spécifié.
     *
     * @param money Le nouveau montant d'argent du joueur.
     */
    public static void setPlayerMoneyText(int money) {
        if (instance != null && instance.PlayerMoneyText != null) {
            instance.PlayerMoneyText.setText("Money: " + money);
        }
    }

    /**
     * Met à jour le label GameInformationText avec le message spécifié.
     *
     * @param message Le nouveau message à afficher.
     */
    public static void setGameInformationText(String message) {
        if (instance != null && instance.GameInformationText != null) {
            instance.GameInformationText.setText(message);
        }
    }

    /**
     * Vérifie si l'instance de HeaderController est initialisée.
     *
     * @return true si l'instance est initialisée, false sinon.
     */
    public static boolean isInstanceInitialized() {
        return instance != null;
    }
}
