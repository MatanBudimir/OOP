package hr.fer.oop.kolekcije.cetvrti;

import hr.fer.oop.kolekcije.treci.LadderEnhanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LadderEnhancedByLossesOrder extends LadderEnhanced {
    public LadderEnhancedByLossesOrder(String... players) {
        super(players);
    }

    public Iterable<String> orderByLosses() {
        List<Integer> results = new ArrayList<>();
        List<String> players = new ArrayList<>();
        for (String player : standings()) {
            players.add(player);
            int loss = losses(player);
            if (!results.contains(loss))
                results.add(loss);
        }


        Collections.sort(results);
        Collections.reverse(results);
        List<String> res = new ArrayList<>();


        for (int r : results) {
            List<String> ps = players.stream().filter(player -> losses(player) == r).toList();
            res.addAll(ps);
        }

        return res;
    }
}
