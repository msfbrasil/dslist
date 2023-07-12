package com.imasolucoes.dslist.repositories;


import com.imasolucoes.dslist.entities.GameList;

import org.springframework.data.jpa.repository.JpaRepository;


public interface GameListRepository extends JpaRepository< GameList, Long > {

}
