package fr.melvinxalexis.machineslotproject.controllers;

import fr.melvinxalexis.machineslotproject.MachineSlotProject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class MainFormController {

    public MainFormController(){

    }
    @FXML
    private Text playerMoney;
    @FXML
    private Text currentBet;
    @FXML
    private Button more;
    @FXML
    private Button less;
    @FXML
    public void initialize(){
        playerMoney.setText( MachineSlotProject.player.getName() +" Money: " + String.valueOf(MachineSlotProject.player.getTokens()));
    }

    public void lessBet(ActionEvent actionEvent) {
        currentBet.setText("less");
    }

    public void moreBet(ActionEvent actionEvent) {
        currentBet.setText("more");
    }
}
