package fr.melvinxalexis.machineslotproject.items;

import java.util.HashMap;
import java.util.Map;

public enum Symbols {

    // *** Symboles réguliers ***
    SYMBOL_1("/symbols/Symbol_1.png", 2, 1, 4, 1.0 / 16),
    SYMBOL_2("/symbols/Symbol_2.png", 5, 4, 2, 1.0 / 16),
    SYMBOL_3("/symbols/Symbol_3.png", 5, 4, 2, 1.0 / 16),
    SYMBOL_4("/symbols/Symbol_4.png", 5, 4, 2, 1.0 / 16),
    SYMBOL_5("/symbols/Symbol_5.png", 5, 4, 2, 1.0 / 16),
    SYMBOL_6("/symbols/Symbol_6.png", 5, 4, 2, 1.0 / 16),
    SYMBOL_7("/symbols/Symbol_7.png", 5, 4, 2, 1.0 / 16),
    SYMBOL_8("/symbols/Symbol_8.png", 5, 4, 2, 1.0 / 16),
    SYMBOL_9("/symbols/Symbol_9.png", 5, 4, 2, 1.0 / 3),

    // *** Symboles spéciaux ***
    SYMBOL_NULL("/symbols/Symbol_Null.png", 5, 4, 2, 1.0 / 3),
    SYMBOL_SPIN("/symbols/Symbol_Spin.png", 5, 4, 2, 1.0 / 3),
    SYMBOL_MORE("/symbols/Symbol_More.png", 5, 4, 2, 1.0 / 3),
    SYMBOL_LESS("/symbols/Symbol_Less.png", 5, 4, 2, 1.0 / 3),

    // *** Symboles de fond ***
    SYMBOLS_BG1("/symbols/Background_1.png", 5, 4, 2, 1.0 / 3),
    SYMBOLS_BG2("/symbols/Background_2.png", 5, 4, 2, 1.0 / 3),
    SYMBOLS_BG3("/symbols/Background_3.png", 5, 4, 2, 1.0 / 3),
    SYMBOLS_BG4("/symbols/Background_4.png", 5, 4, 2, 1.0 / 3),
    SYMBOLS_BG5("/symbols/Background_5.png", 5, 4, 2, 1.0 / 3),
    SYMBOLS_BG6("/symbols/Background_6.png", 5, 4, 2, 1.0 / 3),
    SYMBOLS_BG7("/symbols/Background_7.png", 5, 4, 2, 1.0 / 3),
    SYMBOLS_BG8("/symbols/Background_8.png", 5, 4, 2, 1.0 / 3),
    SYMBOLS_BG9("/symbols/Background_9.png", 5, 4, 2, 1.0 / 3),
    SYMBOLS_BG10("/symbols/Background_10.png", 5, 4, 2, 1.0 / 3),
    SYMBOLS_BG11("/symbols/Background_11.png", 5, 4, 2, 1.0 / 3),
    SYMBOLS_BG12("/symbols/Background_12.png", 5, 4, 2, 1.0 / 3),
    SYMBOLS_BG13("/symbols/Background_13.png", 5, 4, 2, 1.0 / 3),
    SYMBOLS_BG14("/symbols/Background_14.png", 5, 4, 2, 1.0 / 3),
    SYMBOLS_BG15("/symbols/Background_15.png", 5, 4, 2, 1.0 / 3);

    private final String imagePath;   // Chemin de l'image du symbole
    private final int multiplier5;    // Multiplicateur pour 5 occurrences
    private final int multiplier4;    // Multiplicateur pour 4 occurrences
    private final int multiplier3;    // Multiplicateur pour 3 occurrences
    private final double frequency;   // Fréquence d'apparition du symbole

    // Constructeur de l'énumération Symbols
    Symbols(String imagePath, int multiplier5, int multiplier4, int multiplier3, double frequency) {
        this.imagePath = imagePath;
        this.multiplier5 = multiplier5;
        this.multiplier4 = multiplier4;
        this.multiplier3 = multiplier3;
        this.frequency = frequency;
    }

    // Méthode pour obtenir le chemin de l'image
    public String getImagePath() {
        return imagePath;
    }

    // Méthode pour obtenir le multiplicateur en fonction du nombre d'occurrences
    public int getMultiplier(int occurrences) {
        return switch (occurrences) {
            case 5 -> multiplier5;
            case 4 -> multiplier4;
            case 3 -> multiplier3;
            default -> 0;
        };
    }

    // Méthode pour obtenir la fréquence d'apparition du symbole
    public double getFrequency() {
        return frequency;
    }

    // Méthode statique pour obtenir le multiplicateur par le nom du symbole et le nombre d'occurrences
    public static int getMultiplierBySymbolName(String symbolName, int occurrences) {
        try {
            Symbols symbol = Symbols.valueOf(symbolName);
            return symbol.getMultiplier(occurrences);
        } catch (IllegalArgumentException e) {
            return 0;
        }
    }
}
