package com.imasolucoes.dslist.repositories;


import com.imasolucoes.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository< Game, Long > {

}
