package com.example.api.room;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RoomWarnings;

import java.util.List;

@Dao
public interface TodoDao {
/*
    @Insert
    void insert(Entity_class entity_class1);

    @Query("SELECT * FROM database_table1")
    List<Entity_class> getAllTodos();



 */
    //@SuppressWarnings(RoomWarnings.CURSOR_MISMATCH)
    @Query("SELECT countryID,CountryName ,Capital,Region,SubRegion,Population,Area,Population,Area,NumericCode,ImgageURl FROM table2")
    List<Entity_class2> getAllCountries();

    @Insert
    void insert2(Entity_class2 entity_class2);

}

