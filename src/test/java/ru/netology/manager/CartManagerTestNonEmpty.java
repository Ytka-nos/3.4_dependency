package ru.netology.manager;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmAtPlaybill;
import ru.netology.manager.CartManager;

import static org.junit.jupiter.api.Assertions.*;

public class CartManagerTestNonEmpty {
    @Test
    public void shouldGetAll() {
        CartManager manager = new CartManager();
        FilmAtPlaybill first = new FilmAtPlaybill(1, 1, "first");
        FilmAtPlaybill second = new FilmAtPlaybill(2, 2, "second");
        FilmAtPlaybill third = new FilmAtPlaybill(3, 3, "third");
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.getAll();

        FilmAtPlaybill[] actual = manager.getAll();
        FilmAtPlaybill[] expected = new FilmAtPlaybill[]{third, second,first};

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
