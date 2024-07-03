package fr.melvinxalexis.machineslotproject.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SymbolSelector {
    public static boolean debug = false;

    private static final List<Symbols> symbols = List.of(
            Symbols.SYMBOL_1, Symbols.SYMBOL_2,
            Symbols.SYMBOL_3, Symbols.SYMBOL_4,
            Symbols.SYMBOL_5, Symbols.SYMBOL_6,
            Symbols.SYMBOL_7, Symbols.SYMBOL_8,
            Symbols.SYMBOL_9);

        public static List<Symbols> generateRandomSymbols(int count, String seed) {
            Random random;
            if (seed != null) {
                random = new Random(seed.hashCode());
            } else {
                random = new Random();
            }

            List<Symbols> result = new ArrayList<>();
            double[] cumulativeProbabilities = calculateCumulativeProbabilities();

            for (int i = 0; i < count; i++) {
                double randomValue = random.nextDouble();

                boolean symbolFound = false;
                for (int j = 0; j < cumulativeProbabilities.length; j++) {
                    if (randomValue < cumulativeProbabilities[j]) {
                        result.add(symbols.get(j));
                        symbolFound = true;
                        break;
                    }
                }

                if (!symbolFound) {
                    result.add(symbols.get(symbols.size() - 1));
                }
            }

            return result;
    }

    private static double[] calculateCumulativeProbabilities() {
        double[] cumulativeProbabilities = new double[symbols.size()];
        double cumulativeProbability = 0.0;

        for (int i = 0; i < symbols.size(); i++) {
            cumulativeProbability += symbols.get(i).getFrequency();
            cumulativeProbabilities[i] = cumulativeProbability;
        }

        if (cumulativeProbability > 0.0) {
            for (int i = 0; i < cumulativeProbabilities.length; i++) {
                cumulativeProbabilities[i] /= cumulativeProbability;
            }
        }

        return cumulativeProbabilities;
    }
}