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
        int gridRows = grid.length;
        int gridCols = grid[0].length;
        int patternRows = pattern.length;
        int patternCols = pattern[0].length;

        // Iterate over each possible starting position in the grid
        for (int i = 0; i <= gridRows - patternRows; i++) {
            for (int j = 0; j <= gridCols - patternCols; j++) {
                // Assume pattern matches until proven otherwise
                boolean match = true;
                for (int k = 0; k < patternRows; k++) {
                    for (int l = 0; l < patternCols; l++) {
                        if (!pattern[k][l].equals("SYMBOL_X") && !grid[i + k][j + l].equals(pattern[k][l])) {
                            match = false;
                            break;
                        }
                    }
                    if (!match) break;
                }
                if (match) return true;
            }
        }
        // No match found
        return false;

    }

    public static boolean isConsecutivePattern(){

        return false;
    }

}
