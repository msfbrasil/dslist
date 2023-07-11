package com.imasolucoes.dslist.services;


import com.imasolucoes.dslist.dto.GameMinDTO;
import com.imasolucoes.dslist.entities.Game;
import com.imasolucoes.dslist.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List< GameMinDTO > findAll() {

        List< Game > gameList = this.gameRepository.findAll();

        return gameList.stream().map( current -> new GameMinDTO( current ) ).collect( Collectors.toList() );
    }
}
