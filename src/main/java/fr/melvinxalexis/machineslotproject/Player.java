package fr.melvinxalexis.machineslotproject;

public class Player {
    private String name;
    private int tokens;
    private int totalWins;
    private int totalSpins;

    public Player(String name) {
        this.name = name;
        this.tokens = 200000;
    }

    public void addTokens(int amount) {
        tokens += amount;
    }

    public void subtractTokens(int amount) {
        tokens -= amount;
    }

    public void incrementTotalWins() {
        totalWins++;
    }

    public void incrementTotalSpins() {
        totalSpins++;
    }

    public String getName() {
        return name;
    }

    public int getTokens() {
        return tokens;
    }

    public int getTotalWins() {
        return totalWins;
    }

    public int getTotalSpins() {
        return totalSpins;
    }
}
