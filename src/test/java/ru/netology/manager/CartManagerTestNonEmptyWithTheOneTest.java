package ru.netology.manager;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmAtPlaybill;
import ru.netology.manager.CartManager;

import static org.junit.jupiter.api.Assertions.*;
public class CartManagerTestNonEmptyWithTheOneTest {
    @Test
    public void shouldGetAllBeforeLimitWithConstructor() {
        CartManager manager = new CartManager(2);
        FilmAtPlaybill first = new FilmAtPlaybill(1, 1, "first");

        manager.add(first);

        manager.getAll();

        FilmAtPlaybill[] actual = manager.getAll();
        FilmAtPlaybill[] expected = new FilmAtPlaybill[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllIsLimitWithConstructor() {
        CartManager manager = new CartManager(1);
        FilmAtPlaybill first = new FilmAtPlaybill(1, 1, "first");

        manager.add(first);

        manager.getAll();

        FilmAtPlaybill[] actual = manager.getAll();
        FilmAtPlaybill[] expected = new FilmAtPlaybill[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllAfterLimitWithConstructor() {
        CartManager manager = new CartManager(0);
        FilmAtPlaybill first = new FilmAtPlaybill(1, 1, "first");

        manager.add(first);

        manager.getAll();

        FilmAtPlaybill[] actual = manager.getAll();
        FilmAtPlaybill[] expected = new FilmAtPlaybill[]{};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldGetAllBeforeLimitDefault() {
        CartManager manager = new CartManager();
        FilmAtPlaybill first = new FilmAtPlaybill(1, 1, "first");

        manager.add(first);

        manager.getAll();

        FilmAtPlaybill[] actual = manager.getAll();
        FilmAtPlaybill[] expected = new FilmAtPlaybill[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd() {
        CartManager manager = new CartManager();
        FilmAtPlaybill first = new FilmAtPlaybill(1, 1, "first");
        FilmAtPlaybill second = new FilmAtPlaybill(2, 2, "second");
        manager.add(first);

        manager.add(second);


        FilmAtPlaybill[] actual = manager.getAll();
        FilmAtPlaybill[] expected = new FilmAtPlaybill[]{second,first};

        assertArrayEquals(expected, actual);

    }



}
