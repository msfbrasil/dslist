package com.imasolucoes.dslist.entities;


import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn( name = "game_id" )
    private Game game;

    @ManyToOne
    @JoinColumn( name = "list_id" )
    private GameList gameList;

    // --

    public BelongingPK() {

    }

    public BelongingPK(
        Game game,
        GameList gameList ) {

        this.game = game;
        this.gameList = gameList;
    }

    // --

    public Game getGame() {

        return game;
    }

    public void setGame( Game game ) {

        this.game = game;
    }

    public GameList getGameList() {

        return gameList;
    }

    public void setGameList( GameList gameList ) {

        this.gameList = gameList;
    }

    // --

    @Override
    public int hashCode() {

        int result = game.hashCode();
        result = 31 * result + gameList.hashCode();

        return result;
    }

    @Override
    public boolean equals( Object obj ) {

        if ( this == obj ) {

            return true;
        }

        if ( ( obj == null ) || ( getClass() != obj.getClass() ) ) {

            return false;
        }

        BelongingPK that = ( BelongingPK ) obj;

        if ( !game.equals( that.game ) ) {

            return false;
        }

        return gameList.equals( that.gameList );
    }
}
