package fr.melvinxalexis.machineslotproject.controllers;

import fr.melvinxalexis.machineslotproject.MachineSlotProject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class MainFormController {
    @FXML
    public static Text WinOrLoseText;
    @FXML
    public AnchorPane SlotsForm;

    @FXML
    private Text CurrentBetText;
    @FXML
    private Button MoreButton;
    @FXML
    private Button LessButton;
    @FXML
    public void initialize(){

    }

    public void onMoreButton(){

    }

    public void onLessButton(){

    }

    public void setWinOrLoseText(String s){
        WinOrLoseText.setText(s);
    }


    public void setCurrentBetText(String s){
        CurrentBetText.setText(s);
    }
}
