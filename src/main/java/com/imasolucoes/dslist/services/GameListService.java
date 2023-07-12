package com.imasolucoes.dslist.services;


import com.imasolucoes.dslist.dto.GameListDTO;
import com.imasolucoes.dslist.entities.GameList;
import com.imasolucoes.dslist.repositories.GameListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional( readOnly = true )
    public List< GameListDTO > findAll() {

        List< GameList > gameLists = this.gameListRepository.findAll();

        return gameLists.stream().map( current -> new GameListDTO( current ) ).collect( Collectors.toList() );
    }
}
