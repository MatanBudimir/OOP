package hr.fer.oop.kolekcije.prvi;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ladder {
    private List<String> players;

    public Ladder(String... players) {
        this.players = new LinkedList<>();

        for (String player : players)
            if (!this.players.contains(player))
                this.players.add(player);
    }

    public void join(String... players) {
        for (String player : players)
            if (!this.players.contains(player))
                this.players.add(player);
    }

    public int count() {
        return players.size();
    }

    public Iterable<String> standings() {
        return players;
    }

    public void gameFinished(String win, String lose) {
        int winner = players.indexOf(win);
        int looser = players.indexOf(lose);

        if (winner < looser) {
            if (winner != 0) {
                players.remove(winner);
                players.add(winner - 1, win);
            }
        } else {
            players.remove(winner);
            players.add(winner - (winner - looser) / 2, win);
        }

        if (looser != players.size() - 1) {
            players.remove(looser);
            players.add(looser + 1, lose);
        }
    }
}
