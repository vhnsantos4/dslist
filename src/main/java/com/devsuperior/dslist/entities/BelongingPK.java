package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

    public BelongingPK() {
    }
    public BelongingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }
    public Game getGame() {
        return game;
    }
    public void setGame(Game game) {
        this.game = game;
    }   
    public GameList getList() {
        return list;
    }
    public void setList(GameList list) {
        this.list = list;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        BelongingPK other = (BelongingPK) o;
        return Objects.equals(game, other.game) && Objects.equals(list, other.list);
    }
}
