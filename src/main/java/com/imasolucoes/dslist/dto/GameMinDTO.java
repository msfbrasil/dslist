package com.imasolucoes.dslist.dto;


import com.imasolucoes.dslist.entities.Game;
import com.imasolucoes.dslist.projections.GameMinProjection;


public class GameMinDTO {

    private Long id;

    private String title;

    private Integer year;

    private String imgUrl;

    private String shortDescription;

    // --

    public GameMinDTO() {

    }

    public GameMinDTO( Game game ) {

        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
    }

    public GameMinDTO( GameMinProjection gameMinProjection ) {

        this.id = gameMinProjection.getId();
        this.title = gameMinProjection.getTitle();
        this.year = gameMinProjection.getGameYear();
        this.imgUrl = gameMinProjection.getImgUrl();
        this.shortDescription = gameMinProjection.getShortDescription();
    }

    // --

    public Long getId() {

        return id;
    }

    public String getTitle() {

        return title;
    }

    public Integer getYear() {

        return year;
    }

    public String getImgUrl() {

        return imgUrl;
    }

    public String getShortDescription() {

        return shortDescription;
    }
}
