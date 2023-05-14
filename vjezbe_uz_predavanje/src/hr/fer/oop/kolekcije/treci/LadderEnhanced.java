package hr.fer.oop.kolekcije.treci;

import hr.fer.oop.kolekcije.drugi.Pair;
import hr.fer.oop.kolekcije.prvi.Ladder;

import java.util.HashMap;
import java.util.Map;

public class LadderEnhanced extends Ladder {
    private Map<String, int[]> stats;

    public LadderEnhanced(String... players) {
        super(players);
        this.stats = new HashMap<>();

        for (String player : players)
            stats.put(player, new int[] {0, 0});
    }

    @Override
    public void join(String... players) {
        super.join(players);

        for (String player : players)
            if (!stats.containsKey(player))
                stats.put(player, new int[] {0, 0});
    }

    public int wins(String player) {
        return stats.get(player)[0];
    }

    public int losses(String player) {
        return stats.get(player)[1];
    }

    @Override
    public void gameFinished(String win, String lose) {
        super.gameFinished(win, lose);

        stats.get(win)[0]++;
        stats.get(lose)[1]++;
    }
}
