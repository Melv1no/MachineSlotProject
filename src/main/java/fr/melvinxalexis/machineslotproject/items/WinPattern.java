package fr.melvinxalexis.machineslotproject.items;

public class WinPattern {
    private Symbols[][] winningPatterns;

    public WinPattern(Symbols[][] winningPatterns) {
        this.winningPatterns = winningPatterns;
    }
    String[][] grid = {
            {"SYMBOL_5", "SYMBOL_5", "SYMBOL_5", "SYMBOL_5", "SYMBOL_5"},
            {"SYMBOL_9", "SYMBOL_9", "SYMBOL_9", "SYMBOL_9", "SYMBOL_9"},
            {"SYMBOL_2", "SYMBOL_2", "SYMBOL_2", "SYMBOL_2", "SYMBOL_2"}
    };

    String[][] pattern1 = {
            {"SYMBOL_A", "SYMBOL_A", "SYMBOL_A", "SYMBOL_A", "SYMBOL_A"},
            {"SYMBOL_B", "SYMBOL_B", "SYMBOL_B", "SYMBOL_B", "SYMBOL_B"},
            {"SYMBOL_C", "SYMBOL_C", "SYMBOL_C", "SYMBOL_C", "SYMBOL_C"}
    };

    String[][] pattern2 = {
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"}
    };

    String[][] pattern3 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"}
    };


    String[][] pattern4 = {
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_A", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"}
    };


    String[][] pattern5 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_A", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"}
    };


    String[][] pattern6 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_A", "SYMBOL_A", "SYMBOL_X"}
    };


    String[][] pattern7 = {
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_A", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"}
    };


    String[][] pattern8 = {
            {"SYMBOL_A", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_A"}
    };

    String[][] pattern9 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"}
    };

    String[][] pattern10 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"}
    };

    String[][] pattern11 = {
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"}
    };

    String[][] pattern12 = {
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"}
    };

    String[][] pattern13 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A"}
    };

    String[][] pattern14 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"}
    };

    String[][] pattern15 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"}
    };


    String[][] pattern16 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"}
    };


    String[][] pattern17 = {
            {"SYMBOL_A", "SYMBOL_A", "SYMBOL_B", "SYMBOL_A", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_B", "SYMBOL_B", "SYMBOL_A", "SYMBOL_B", "SYMBOL_B"}
    };



    String[][] pattern18 = {
            {"SYMBOL_A", "SYMBOL_B", "SYMBOL_B", "SYMBOL_B", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_B", "SYMBOL_A", "SYMBOL_A", "SYMBOL_A", "SYMBOL_B"}
    };



    String[][] pattern19 = {
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"}
    };



    String[][] pattern20 = {
            {"SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X"},
            {"SYMBOL_A", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_A", "SYMBOL_X", "SYMBOL_X"}
    };



    String[][] pattern21 = {
            {"SYMBOL_A", "SYMBOL_B", "SYMBOL_A", "SYMBOL_B", "SYMBOL_A"},
            {"SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X", "SYMBOL_X"},
            {"SYMBOL_B", "SYMBOL_A", "SYMBOL_B", "SYMBOL_A", "SYMBOL_B"}
    };

    public void check() {
        String[][] win = {
                {"SYMBOL_5", "SYMBOL_4", "SYMBOL_3", "SYMBOL_2", "SYMBOL_1"},
                {"SYMBOL_5", "SYMBOL_4", "SYMBOL_3", "SYMBOL_2", "SYMBOL_1"},
                {"SYMBOL_5", "SYMBOL_4", "SYMBOL_3", "SYMBOL_2", "SYMBOL_1"}
        };
    }
}
