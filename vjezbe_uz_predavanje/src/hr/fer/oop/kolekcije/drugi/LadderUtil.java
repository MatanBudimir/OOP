package hr.fer.oop.kolekcije.drugi;

import hr.fer.oop.kolekcije.prvi.Ladder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LadderUtil {
    public static Iterable<Pair<String>> randomDraw(Ladder ladder) {
        List<Pair<String>> result = new LinkedList<>();
        List<String> players = new ArrayList<>();
        for (String player : ladder.standings())
            players.add(player);

        Collections.shuffle(players);

        for (int i = 1; i <= players.size(); i += 2)
            if (players.size() == i && players.size() % 2 == 1)
                result.add(new Pair<>(players.get(i - 1), "FREE"));
            else
                result.add(new Pair<>(players.get(i - 1), players.get(i)));

        return result;
    }
}
