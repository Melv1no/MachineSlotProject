package fr.melvinxalexis.machineslotproject.controllers;

import fr.melvinxalexis.machineslotproject.MachineSlotProject;
import fr.melvinxalexis.machineslotproject.items.SymbolSelector;
import fr.melvinxalexis.machineslotproject.items.Symbols;
import fr.melvinxalexis.machineslotproject.items.WinPattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlotController {
    private List<ImageView> imageViews = new ArrayList<>();

    @FXML private Button start;
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

    private Symbols[][] symbolMatrix;

    public void initialize() {
        imageViews = Arrays.asList(iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9, iv10, iv11, iv12, iv13, iv14, iv15);

        symbolMatrix = new Symbols[3][5];
    }

    public void handleRollButtonClick(ActionEvent actionEvent) {
        start.disarm();
        List<Symbols> randomSymbols = SymbolSelector.getRandomSymbols(15);

        if(!MachineSlotProject.debug)
            for (int i = 0; i < imageViews.size(); i++) {
                loadImage(imageViews.get(i), randomSymbols.get(i).getImagePath());
                int row = i / 5;
                int col = i % 5;
                symbolMatrix[row][col] = randomSymbols.get(i);
            }
        else
            loadImage(iv1,Symbols.SYMBOL_3.getImagePath());
            loadImage(iv2,Symbols.SYMBOL_3.getImagePath());
            loadImage(iv3,Symbols.SYMBOL_3.getImagePath());
            loadImage(iv4,Symbols.SYMBOL_3.getImagePath());
            loadImage(iv5,Symbols.SYMBOL_3.getImagePath());

            loadImage(iv6,Symbols.SYMBOL_1.getImagePath());
            loadImage(iv7,Symbols.SYMBOL_1.getImagePath());
            loadImage(iv8,Symbols.SYMBOL_1.getImagePath());
            loadImage(iv9,Symbols.SYMBOL_1.getImagePath());
            loadImage(iv10,Symbols.SYMBOL_1.getImagePath());

            loadImage(iv11,Symbols.SYMBOL_8.getImagePath());
            loadImage(iv12,Symbols.SYMBOL_8.getImagePath());
            loadImage(iv13,Symbols.SYMBOL_8.getImagePath());
            loadImage(iv14,Symbols.SYMBOL_8.getImagePath());
            loadImage(iv15,Symbols.SYMBOL_8.getImagePath());


        WinPattern winPattern = new WinPattern(symbolMatrix);
        //winPattern.check();
        printSymbolMatrix();
        start.arm();
    }

    private void loadImage(ImageView imageView, String imagePath) {
        try {
            Image image = new Image(getClass().getResourceAsStream(imagePath));
            imageView.setImage(image);
        } catch (Exception e) {
            System.err.println("Failed to load image: " + imagePath);
            e.printStackTrace();
        }
    }

    private void printSymbolMatrix() {
        for (int row = 0; row < symbolMatrix.length; row++) {
            for (int col = 0; col < symbolMatrix[row].length; col++) {
                System.out.print(symbolMatrix[row][col].name() + " ");
            }
            System.out.println();
        }
    }

    public Symbols[][] getSymbolMatrix() {
        return symbolMatrix;
    }
}
