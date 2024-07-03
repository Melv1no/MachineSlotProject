package fr.melvinxalexis.machineslotproject;

/**
 * La classe Player représente un joueur dans le projet de machine à sous.
 * Chaque joueur a un nom, un nombre de jetons, un total de victoires et un total de tours.
 */
public class Player {
    private final String name;  // Le nom du joueur ne change jamais après l'initialisation.
    private int tokens;         // Nombre de jetons possédés par le joueur.
    private int totalWins;      // Nombre total de victoires.
    private int totalSpins;     // Nombre total de tours de jeu.
    public static final int DEFAULT_MONEY = 200000;

    /**
     * Constructeur pour initialiser un joueur avec un nom.
     * Le joueur commence avec 10,000 jetons.
     *
     * @param name Nom du joueur. Ne doit pas être null ou vide.
     * @throws IllegalArgumentException si le nom est null ou vide.
     */
    public Player(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Le nom du joueur ne peut pas être null ou vide.");
        }
        this.name = name;
        this.tokens = DEFAULT_MONEY;
    }

    public Player(String name, int tokens) {
        this.name = name;
        this.tokens = tokens;
    }

    /**
     * Ajoute un certain nombre de jetons au total du joueur.
     *
     * @param amount Le nombre de jetons à ajouter. Doit être positif.
     * @throws IllegalArgumentException si le montant est négatif.
     */
    public int addTokens(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Le montant à ajouter doit être positif.");
        }
        return this.tokens += amount;
    }

    /**
     * Soustrait un certain nombre de jetons du total du joueur.
     *
     * @param amount Le nombre de jetons à soustraire. Doit être positif et inférieur ou égal aux jetons disponibles.
     * @throws IllegalArgumentException si le montant est négatif ou supérieur aux jetons disponibles.
     */
    public void subtractTokens(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Le montant à soustraire doit être positif.");
        }
        if (amount > this.tokens) {
            throw new IllegalArgumentException("Pas assez de jetons pour soustraire le montant demandé.");
        }
        this.tokens -= amount;
    }

    /**
     * Vérifie si le joueur possède suffisamment de jetons.
     *
     * @param amount Le montant à vérifier. Doit être positif.
     * @return true si le joueur a au moins autant de jetons que le montant spécifié, false sinon.
     * @throws IllegalArgumentException si le montant est négatif.
     */
    public boolean hasMoney(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Le montant à vérifier doit être positif.");
        }
        return this.tokens >= amount;
    }

    /**
     * Incrémente le nombre total de victoires du joueur.
     */
    public void incrementTotalWins() {
        this.totalWins++;
    }

    /**
     * Incrémente le nombre total de tours de jeu du joueur.
     */
    public void incrementTotalSpins() {
        this.totalSpins++;
    }

    /**
     * Obtient le nom du joueur.
     *
     * @return Le nom du joueur.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtient le nombre de jetons du joueur.
     *
     * @return Le nombre de jetons.
     */
    public int getTokens() {
        return this.tokens;
    }

    /**
     * Obtient le nombre total de victoires du joueur.
     *
     * @return Le nombre total de victoires.
     */
    public int getTotalWins() {
        return this.totalWins;
    }

    /**
     * Obtient le nombre total de tours de jeu du joueur.
     *
     * @return Le nombre total de tours de jeu.
     */
    public int getTotalSpins() {
        return this.totalSpins;
    }
}
