package fr.melvinxalexis.machineslotproject.items;

import java.util.*;

public class SymbolPattern {
    static String[][] pattern1 = {
            {"SYMBOL_A", "SYMBOL_A", "SYMBOL_A", "SYMBOL_A", "SYMBOL_A"},
            {"SYMBOL_B", "SYMBOL_B", "SYMBOL_B", "SYMBOL_B", "SYMBOL_B"},
            {"SYMBOL_C", "SYMBOL_C", "SYMBOL_C", "SYMBOL_C", "SYMBOL_C"}
    };

    static String[][] pattern2 = {
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"}
    };

    static String[][] pattern3 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"}
    };


    static String[][] pattern4 = {
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_A", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"}
    };


    static String[][] pattern5 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_A", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"}
    };


    static String[][] pattern6 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_A", "SYMBOL_A", "SYMBOL_X"}
    };


    static String[][] pattern7 = {
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_A", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"}
    };


    static String[][] pattern8 = {
            {"SYMBOL_A", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_A"}
    };

    static String[][] pattern9 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"}
    };

    static String[][] pattern10 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"}
    };

    static String[][] pattern11 = {
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"}
    };

    static String[][] pattern12 = {
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"}
    };

    static String[][] pattern13 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A"}
    };

    static String[][] pattern14 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"}
    };

    static String[][] pattern15 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"}
    };


    static String[][] pattern16 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"}
    };
    static String[][] pattern17 = {
            {"SYMBOL_A", "SYMBOL_A", "SYMBOL_B", "SYMBOL_A", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_B", "SYMBOL_B", "SYMBOL_A", "SYMBOL_B", "SYMBOL_B"}
    };

    static String[][] pattern18 = {
            {"SYMBOL_A", "SYMBOL_B", "SYMBOL_B", "SYMBOL_B", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_B", "SYMBOL_A", "SYMBOL_A", "SYMBOL_A", "SYMBOL_B"}
    };

    static String[][] pattern19 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"}
    };


    static String[][] pattern20 = {
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"}
    };


    static String[][] pattern21 = {
            {"SYMBOL_A", "SYMBOL_B", "SYMBOL_A", "SYMBOL_B", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_B", "SYMBOL_A", "SYMBOL_B", "SYMBOL_A", "SYMBOL_B"}
    };

    private static int multiplicator;
    private static String foundSymbol = null;
    private static int symbolCount = 0;
    public static  List<String[][]> patterns = Arrays.asList(
            pattern1, pattern2, pattern3, pattern4, pattern5, pattern6, pattern8, pattern7,
            pattern9, pattern10, pattern11, pattern12, pattern13, pattern14, pattern15, pattern16,
            pattern17, pattern18, pattern19, pattern20, pattern21);

    public static Integer getCurrentMultiplicator() {
        return multiplicator;
    }

    public static boolean isValidPattern(String[][] grid, String[][] pattern) {
        int rows = grid.length;
        int cols = grid[0].length;
        int patternRows = pattern.length;
        int patternCols = pattern[0].length;

        // Vérifier que le pattern est plus petit ou de même taille que la grille
        if (patternRows > rows || patternCols > cols) {
            return false;
        }

        // Map pour stocker la correspondance des symboles spécifiques
        Map<String, String> symbolMap = new HashMap<>();

        // Parcourir la grille pour vérifier le pattern
        for (int r = 0; r <= rows - patternRows; r++) {
            for (int c = 0; c <= cols - patternCols; c++) {
                boolean match = true;

                // Vérifier le pattern à partir de la position (r, c)
                for (int pr = 0; pr < patternRows; pr++) {
                    for (int pc = 0; pc < patternCols; pc++) {
                        String patternElement = pattern[pr][pc];
                        String gridElement = grid[r + pr][c + pc];

                        // Vérifier si le pattern correspond
                        if (!patternElement.equals("SYMBOL_X")) {
                            // Vérifier la correspondance symbole à symbole
                            if (symbolMap.containsKey(patternElement)) {
                                if (!symbolMap.get(patternElement).equals(gridElement)) {
                                    match = false;
                                    break;
                                }
                            } else {
                                // Ajouter la correspondance symbole à symbole
                                symbolMap.put(patternElement, gridElement);
                            }
                        }
                    }
                    if (!match) break;
                }

                // Si on trouve un match, retourner true
                if (match) return true;

                // Réinitialiser la correspondance pour tester d'autres positions
                symbolMap.clear();
            }
        }

        // Aucun match trouvé
        return false;
    }

    public static boolean isConsecutivePattern(String[] row) {
        if (row == null || row.length == 0) {
            return false;
        }

        int count = 1; // Compte au moins une occurrence pour le premier élément

        for (int i = 1; i < row.length; i++) {
            System.out.println(row[i]);
            if (row[i].equals(row[i - 1])) {
                count++;
                // Vérifier si le compte atteint 3, 4 ou 5
                if (count == 3 || count == 4 || count == 5) {
                    multiplicator = Symbols.getMultiplierBySymbolName(row[i],count);
                    System.out.println(row[i] + " found at " + count + " time mutiplicator is " + multiplicator);
                    return true;
                }
            } else {
                count = 1; // Réinitialiser le compteur si l'élément n'est pas consécutif
            }
        }

        return false;
    }

}
