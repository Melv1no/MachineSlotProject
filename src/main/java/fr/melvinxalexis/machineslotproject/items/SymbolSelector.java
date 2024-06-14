package fr.melvinxalexis.machineslotproject.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SymbolSelector {

    public static List<Symbols> getRandomSymbols(int count) {
        List<Symbols> symbols = new ArrayList<>();
        Random random = new Random();

        double[] cumulativeFrequencies = new double[Symbols.values().length];
        cumulativeFrequencies[0] = Symbols.values()[0].getFrequency();

        for (int i = 1; i < Symbols.values().length; i++) {
            cumulativeFrequencies[i] = cumulativeFrequencies[i - 1] + Symbols.values()[i].getFrequency();
        }

        for (int i = 0; i < cumulativeFrequencies.length; i++) {
            cumulativeFrequencies[i] /= cumulativeFrequencies[cumulativeFrequencies.length - 1];
        }

        for (int i = 0; i < count; i++) {
            double rand = random.nextDouble();
            for (int j = 0; j < cumulativeFrequencies.length; j++) {
                if (rand <= cumulativeFrequencies[j]) {
                    symbols.add(Symbols.values()[j]);
                    break;
                }
            }
        }

        return symbols;
    }
}
