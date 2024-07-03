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
    // Label affichant le montant de la mise actuelle.
    public Label BetText;

    // Liste des ImageView représentant les symboles affichés sur l'interface.
    private List<ImageView> imageViews = new ArrayList<>();

    // ImageView pour les boutons permettant de diminuer ou d'augmenter la mise.
    @FXML public ImageView LessButton;
    @FXML public ImageView MoreButton;

    // ImageView pour le bouton de lancement du jeu.
    @FXML private ImageView spinButton;

    // ImageView pour chaque emplacement du slot machine.
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

    // Matrice des symboles affichés à l'écran.
    private String[][] symbolMatrix;

    // Variable représentant la mise actuelle.
    private int bet = 0;

    /**
     * Méthode d'initialisation appelée automatiquement après la création de la scène.
     * Elle configure les éléments visuels et initialise les paramètres par défaut.
     */
    @FXML
    public void initialize() {
        // Initialisation de la liste des ImageView.
        imageViews = Arrays.asList(iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9, iv10, iv11, iv12, iv13, iv14, iv15);

        // Liste des symboles de fond par défaut.
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

        // Initialisation de la matrice des symboles (3x5 pour une grille de slot machine classique).
        symbolMatrix = new String[3][5];

        // Configuration des images des boutons (spin, more, less) à partir des ressources.
        spinButton.setImage(new Image(getClass().getResourceAsStream(Symbols.SYMBOL_SPIN.getImagePath())));
        MoreButton.setImage(new Image(getClass().getResourceAsStream(Symbols.SYMBOL_MORE.getImagePath())));
        LessButton.setImage(new Image(getClass().getResourceAsStream(Symbols.SYMBOL_LESS.getImagePath())));

        // Définition de la mise initiale à 100.
        bet = 100;
        BetText.setText("100");

        // Configuration initiale des symboles de fond pour chaque emplacement de l'interface.
        for (int i = 0; i < imageViews.size(); i++) {
            ImageView imageView = imageViews.get(i);
            Symbols symbol = backgroundSymbols.get(i);
            imageView.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(symbol.getImagePath()))));
        }
    }

    /**
     * Gestionnaire d'événements pour le bouton "spin".
     * Cette méthode est appelée lorsque l'utilisateur clique sur le bouton de lancement du jeu.
     *
     * @param actionEvent L'événement de la souris déclenché par le clic.
     */
    public void onSpinButton(MouseEvent actionEvent) {
        // Vérifie si le joueur a assez d'argent pour miser.
        if (!MachineSlotProject.player.hasMoney(bet)) {
            HeaderController.setGameInformationText("You don't have enough money");
            return;
        }

        // Déduit la mise du montant total de l'argent du joueur.
        MachineSlotProject.player.subtractTokens(bet);
        HeaderController.setPlayerMoneyText(MachineSlotProject.player.getTokens());

        // Génère 15 symboles aléatoires pour l'affichage.
        final List<Symbols> randomSymbols = SymbolSelector.generateRandomSymbols(15, new Date().toString());

        // Désactive le bouton de spin pendant que les symboles sont en train de tourner.
        spinButton.setDisable(true);
        HeaderController.setGameInformationText("Spinning ...");

        // Crée l'animation des symboles
        Timeline timeline = createSpinAnimation(randomSymbols);

        // Action à exécuter une fois que l'animation de rotation est terminée.
        timeline.setOnFinished(event -> handleSpinCompletion());

        // Lance l'animation.
        timeline.play();
    }

    /**
     * Crée l'animation de rotation des symboles avec les `KeyFrames`.
     *
     * @param randomSymbols Liste des symboles à afficher.
     * @return Un objet Timeline configuré avec l'animation.
     */
    private Timeline createSpinAnimation(List<Symbols> randomSymbols) {
        Timeline timeline = new Timeline();
        int numRows = 3;
        int numCols = 5;

        int index = 0;

        // Animation des symboles intermédiaires
        for (int i = 0; i < 4; i++) {
            List<Symbols> tempRandomSymbols = SymbolSelector.generateRandomSymbols(60, new Date().toString());
            for (int col = 0; col < numCols; col++) {
                for (int row = 0; row < numRows; row++) {
                    final int rowIndex = row;
                    final int colIndex = col;
                    final int finalIndex = index;
                    final List<Symbols> finalTempRandomSymbols = tempRandomSymbols;

                    KeyFrame keyFrame = new KeyFrame(Duration.seconds(0.05 * index), event -> {
                        updateImageView(rowIndex, colIndex, finalTempRandomSymbols.get(finalIndex % finalTempRandomSymbols.size()));
                    });
                    timeline.getKeyFrames().add(keyFrame);
                    index++;
                }
            }
        }

        // Mise à jour avec les symboles finaux
        for (int col = 0; col < numCols; col++) {
            for (int row = 0; row < numRows; row++) {
                final int rowIndex = row;
                final int colIndex = col;
                KeyFrame keyFrame = new KeyFrame(Duration.seconds(0.05 * index + 0.5), event -> {
                    int imageIndex = rowIndex * numCols + colIndex;
                    updateImageView(rowIndex, colIndex, randomSymbols.get(imageIndex));
                    symbolMatrix[rowIndex][colIndex] = randomSymbols.get(imageIndex).name();
                });
                timeline.getKeyFrames().add(keyFrame);
                index++;
            }
        }

        return timeline;
    }


    /**
     * Met à jour l'ImageView pour une position spécifique dans la grille.
     *
     * @param rowIndex L'index de la ligne.
     * @param colIndex L'index de la colonne.
     * @param symbol Le symbole à afficher.
     */
    private void updateImageView(int rowIndex, int colIndex, Symbols symbol) {
        int imageIndex = rowIndex * 5 + colIndex;
        imageViews.get(imageIndex).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(symbol.getImagePath()))));
    }

    /**
     * Gère la logique après la fin de l'animation de rotation.
     */
    private void handleSpinCompletion() {
        int moneyEarned = 0;

        printSymbolMatrix();

        // Vérifie chaque pattern pour déterminer si le joueur a gagné.
        for (String[][] pattern : SymbolPattern.patterns) {
            if (!SymbolPattern.isValidPattern(symbolMatrix, pattern)) {
                HeaderController.setGameInformationText("Bad luck, nothing");
            } else {
                HeaderController.setGameInformationText("You win money!");
                System.out.println("money");
                MachineSlotProject.player.addTokens(1);
            }
        }

        // Vérifie les patterns consécutifs
        for (String[] row : symbolMatrix) {
            if (SymbolPattern.isConsecutivePattern(row)) {
                moneyEarned += SymbolPattern.getCurrentMultiplicator() * bet;
            }
        }
        if(moneyEarned != 0 )
            HeaderController.setGameInformationText("You have win "+ moneyEarned +" money!");
            HeaderController.setPlayerMoneyText(MachineSlotProject.player.addTokens(moneyEarned));
            moneyEarned = 0;


        // Met à jour la base de données avec le nouvel état financier du joueur.
        NoSqlConnector.updateMoney(MachineSlotProject.player.getName(), MachineSlotProject.player.getTokens());

        // Réactive le bouton de spin.
        spinButton.setDisable(false);
    }

    /**
     * Gestionnaire d'événements pour le bouton "More".
     * Cette méthode augmente la mise lorsque l'utilisateur clique sur le bouton "+".
     *
     * @param actionEvent L'événement de la souris déclenché par le clic.
     */
    public void onMoreButton(MouseEvent actionEvent) {
        // Augmente la mise en fonction des paliers prédéfinis.
        bet = switch (bet) {
            case 100 -> 250;
            case 250 -> 500;
            case 500 -> 1000;
            case 1000 -> 2500;
            case 2500 -> 5000;
            case 5000 -> 5000;  // La mise maximale est 5000.
            default -> bet;
        };

        // Met à jour l'affichage de la mise.
        BetText.setText(String.valueOf(bet));
    }

    /**
     * Gestionnaire d'événements pour le bouton "Less".
     * Cette méthode diminue la mise lorsque l'utilisateur clique sur le bouton "-".
     *
     * @param actionEvent L'événement de la souris déclenché par le clic.
     */
    public void onLessButton(MouseEvent actionEvent) {
        // Diminue la mise en fonction des paliers prédéfinis.
        bet = switch (bet) {
            case 5000 -> 2500;
            case 2500 -> 1000;
            case 1000 -> 500;
            case 500 -> 250;
            case 250 -> 100;
            case 100 -> 100;  // La mise minimale est 100.
            default -> bet;
        };

        // Met à jour l'affichage de la mise.
        BetText.setText(String.valueOf(bet));
    }

    public void printSymbolMatrix() {
        System.out.println("Current Symbol Matrix:");
        for (String[] row : symbolMatrix) {
            for (String symbol : row) {
                System.out.print(symbol + " ");
            }
            System.out.println(); // Nouvelle ligne après chaque ligne de la matrice
        }
        System.out.println(); // Nouvelle ligne après toute la matrice
    }
}
