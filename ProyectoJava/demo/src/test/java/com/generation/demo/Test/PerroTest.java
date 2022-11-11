package com.generation.demo.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.generation.demo.models.Perro;

class PerroTest {
    @Test
    void testAdopcion(){
        Perro perro = new Perro();

        assertEquals(false, perro.adopcion());
    }
}
