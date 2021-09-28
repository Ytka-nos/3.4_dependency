package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmAtPlaybill;


import static org.junit.jupiter.api.Assertions.*;

public class CartManagerTestEmptyTest {
    @Test
    public void shouldGetAll() {
        CartManager manager = new CartManager();


        manager.getAll();

        FilmAtPlaybill[] actual = manager.getAll();
        FilmAtPlaybill[] expected = new FilmAtPlaybill[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd() {
        CartManager manager = new CartManager();
        FilmAtPlaybill first = new FilmAtPlaybill(1, 1, "first");

        manager.add(first);

        FilmAtPlaybill[] actual = manager.getAll();
        FilmAtPlaybill[] expected = new FilmAtPlaybill[]{first};

        assertArrayEquals(expected, actual);

    }
}
