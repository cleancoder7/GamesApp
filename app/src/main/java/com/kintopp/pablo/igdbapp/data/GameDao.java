package com.kintopp.pablo.igdbapp.data;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Query;

@Dao
public interface GameDao {

    long[] insertGames(List<Game> games);

    @Query("SELECT * FROM 'Game' ")
    List<Game> getAllGames();

}
