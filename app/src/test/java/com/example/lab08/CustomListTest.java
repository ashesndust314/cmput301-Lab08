package com.example.lab08;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    private CustomList setup(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        return list;
    }

    private City mockCity(){ return new City("Calgary", "AB");}

    @Test
    public void testHasCity(){
        CustomList list = setup();
        assertTrue(list.hasCity(mockCity()));
    }

    @Test
    public void testCount(){
        assertEquals(1, setup().count());
    }
}
