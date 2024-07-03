package fr.melvinxalexis.machineslotproject.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SymbolSelector {
    // Indicateur de mode débogage, peut être activé pour des logs supplémentaires.
    public static boolean debug = false;

    // Liste statique et immuable de tous les symboles possibles.
    private static final List<Symbols> symbols = List.of(
            Symbols.SYMBOL_1, Symbols.SYMBOL_2,
            Symbols.SYMBOL_3, Symbols.SYMBOL_4,
            Symbols.SYMBOL_5, Symbols.SYMBOL_6,
            Symbols.SYMBOL_7, Symbols.SYMBOL_8,
            Symbols.SYMBOL_9);

    /**
     * Génère une liste de symboles aléatoires en utilisant les probabilités associées à chaque symbole.
     *
     * @param count Le nombre de symboles à générer.
     * @param seed  Une graine optionnelle pour initialiser le générateur de nombres aléatoires.
     * @return Une liste de `count` symboles aléatoires.
     */
    public static List<Symbols> generateRandomSymbols(int count, String seed) {
        // Initialisation du générateur de nombres aléatoires avec ou sans graine.
        Random random;
        if (seed != null) {
            random = new Random(seed.hashCode());
        } else {
            random = new Random();
        }

        // Liste pour stocker les symboles générés.
        List<Symbols> result = new ArrayList<>();
        // Calcul des probabilités cumulatives pour faciliter la sélection des symboles.
        double[] cumulativeProbabilities = calculateCumulativeProbabilities();

        // Génération des `count` symboles aléatoires.
        for (int i = 0; i < count; i++) {
            double randomValue = random.nextDouble();  // Valeur aléatoire entre 0.0 et 1.0.

            // Sélection du symbole en fonction de la valeur aléatoire.
            boolean symbolFound = false;
            for (int j = 0; j < cumulativeProbabilities.length; j++) {
                if (randomValue < cumulativeProbabilities[j]) {
                    result.add(symbols.get(j));
                    symbolFound = true;
                    break;
                }
            }

            // Si aucun symbole n'a été trouvé (ce qui est rare), ajouter le dernier symbole par défaut.
            if (!symbolFound) {
                result.add(symbols.get(symbols.size() - 1));
            }
        }

        return result;  // Retourne la liste des symboles générés.
    }

    /**
     * Calcule les probabilités cumulatives basées sur les fréquences de chaque symbole.
     *
     * @return Un tableau de probabilités cumulatives.
     */
    private static double[] calculateCumulativeProbabilities() {
        double[] cumulativeProbabilities = new double[symbols.size()];
        double cumulativeProbability = 0.0;

        // Accumulation des fréquences de chaque symbole.
        for (int i = 0; i < symbols.size(); i++) {
            cumulativeProbability += symbols.get(i).getFrequency();
            cumulativeProbabilities[i] = cumulativeProbability;
        }

        // Normalisation des probabilités pour qu'elles somme à 1.
        if (cumulativeProbability > 0.0) {
            for (int i = 0; i < cumulativeProbabilities.length; i++) {
                cumulativeProbabilities[i] /= cumulativeProbability;
            }
        }

        return cumulativeProbabilities;  // Retourne le tableau des probabilités cumulatives normalisées.
    }
}
