package fr.melvinxalexis.machineslotproject.controllers;

import fr.melvinxalexis.machineslotproject.MachineSlotProject;
import fr.melvinxalexis.machineslotproject.NoSqlConnector;
import fr.melvinxalexis.machineslotproject.items.SymbolSelector;
import fr.melvinxalexis.machineslotproject.items.Symbols;
import fr.melvinxalexis.machineslotproject.items.SymbolPattern;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

import java.util.*;


public class SlotController {

    public Label BetText;
    private List<ImageView> imageViews = new ArrayList<>();
    @FXML public ImageView LessButton;
    @FXML public ImageView MoreButton;
    @FXML private ImageView spinButton;
    @FXML private ImageView iv1;
    @FXML private ImageView iv2;
    @FXML private ImageView iv3;
    @FXML private ImageView iv4;
    @FXML private ImageView iv5;
    @FXML private ImageView iv6;
    @FXML private ImageView iv7;
    @FXML private ImageView iv8;
    @FXML private ImageView iv9;
    @FXML private ImageView iv10;
    @FXML private ImageView iv11;
    @FXML private ImageView iv12;
    @FXML private ImageView iv13;
    @FXML private ImageView iv14;
    @FXML private ImageView iv15;
    private String[][] symbolMatrix;
    private int bet = 0;

    @FXML
    public void initialize() {
        imageViews = Arrays.asList(iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9, iv10, iv11, iv12, iv13, iv14, iv15);
        List<Symbols> backgroundSymbols = Arrays.asList(
                Symbols.SYMBOLS_BG1,
                Symbols.SYMBOLS_BG2,
                Symbols.SYMBOLS_BG3,
                Symbols.SYMBOLS_BG4,
                Symbols.SYMBOLS_BG5,
                Symbols.SYMBOLS_BG6,
                Symbols.SYMBOLS_BG7,
                Symbols.SYMBOLS_BG8,
                Symbols.SYMBOLS_BG9,
                Symbols.SYMBOLS_BG10,
                Symbols.SYMBOLS_BG11,
                Symbols.SYMBOLS_BG12,
                Symbols.SYMBOLS_BG13,
                Symbols.SYMBOLS_BG14,
                Symbols.SYMBOLS_BG15
        );

        symbolMatrix = new String[3][5];

        spinButton.setImage(new Image(getClass().getResourceAsStream(Symbols.SYMBOL_SPIN.getImagePath())));
        MoreButton.setImage(new Image(getClass().getResourceAsStream(Symbols.SYMBOL_MORE.getImagePath())));
        LessButton.setImage(new Image(getClass().getResourceAsStream(Symbols.SYMBOL_LESS.getImagePath())));
        bet = 100;
        BetText.setText("100");

        for (int i = 0; i < imageViews.size(); i++) {
            ImageView imageView = imageViews.get(i);
            Symbols symbol = backgroundSymbols.get(i);
            imageView.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(symbol.getImagePath()))));
        }


    }



    public void onSpinButton(MouseEvent actionEvent) {

        if(!MachineSlotProject.player.hasMoney(bet)) {
            HeaderController.setGameInformationText("You don't have engout Money");
            return;
        }

        MachineSlotProject.player.subtractTokens(bet);
        HeaderController.setPlayerMoneyText(MachineSlotProject.player.getTokens());
        List<Symbols> randomSymbols = SymbolSelector.generateRandomSymbols(15,new Date().toString());

        spinButton.setDisable(true);
        HeaderController.setGameInformationText("Spinning ...");
        Timeline timeline = new Timeline();

        int numRows = 3;
        int numCols = 5;

        int index = 0;
        List<Symbols> tempRandomSymbols;
        for(int i = 0; i < 4; i++) {
            tempRandomSymbols = SymbolSelector.generateRandomSymbols(60,new Date().toString());
            for (int col = 0; col < numCols; col++) {

                for (int row = 0; row < numRows; row++) {
                    final int rowIndex = row;
                    int finalCol = col;
                    int finalIndex = index;
                    List<Symbols> finalTempRandomSymbols = tempRandomSymbols;

                    KeyFrame keyFrame = new KeyFrame(Duration.seconds(0.05 * index), event -> {
                        int imageIndex = rowIndex * numCols + finalCol;
                        imageViews.get(imageIndex).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(finalTempRandomSymbols.get(finalIndex).getImagePath()))));
                    });
                    timeline.getKeyFrames().add(keyFrame);
                    index++;
                }
            }
        }

        for (int col = 0; col < numCols; col++) {
            for (int row = 0; row < numRows; row++) {
                final int rowIndex = row;
                int finalCol = col;
                KeyFrame keyFrame = new KeyFrame(Duration.seconds( 0.1 ), event -> {
                    int imageIndex = rowIndex * numCols + finalCol;
                    imageViews.get(imageIndex).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(randomSymbols.get(imageIndex).getImagePath()))));
                    symbolMatrix[rowIndex][finalCol] = randomSymbols.get(imageIndex).name();
                });
                timeline.getKeyFrames().add(keyFrame);
                index++;
            }
        }

        timeline.setOnFinished(event -> {

            int moneyEarn = 0;
            for(String[][] pattern : SymbolPattern.patterns){

                if(!SymbolPattern.isValidPattern(symbolMatrix,pattern)){
                    HeaderController.setGameInformationText("Bad luck, nothing");
                }else{
                    HeaderController.setGameInformationText("You have win money !");
                    System.out.println("moeny");
                    MachineSlotProject.player.addTokens(1);
                }

            }

            HeaderController.setPlayerMoneyText(MachineSlotProject.player.getTokens());
            NoSqlConnector.updateMoney(MachineSlotProject.player.getName(),MachineSlotProject.player.getTokens());
            spinButton.setDisable(false);

        });
        timeline.play();

    }

    public void onMoreButton(MouseEvent actionEvent) {
        bet = switch (bet) {
            case 100 -> 250;
            case 250 -> 500;
            case 500 -> 1000;
            case 1000 -> 2500;
            case 2500 -> 5000;
            case 5000 -> 5000;
            default -> bet;
        };

        BetText.setText(String.valueOf(bet));
    }

    public void onLessButton(MouseEvent actionEvent) {
        bet = switch (bet) {
            case 5000 -> 2500;
            case 2500 -> 1000;
            case 1000 -> 500;
            case 500 -> 250;
            case 250 -> 100;
            case 100 -> 100;
            default -> bet;
        };

        BetText.setText(String.valueOf(bet));
    }
}
