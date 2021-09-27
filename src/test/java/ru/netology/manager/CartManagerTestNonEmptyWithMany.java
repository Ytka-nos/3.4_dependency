package ru.netology.manager;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmAtPlaybill;


import static org.junit.jupiter.api.Assertions.*;

public class CartManagerTestNonEmptyWithMany {
    @Test
    public void shouldGetAllBeforeLimitDefault() {
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
    public void shouldGetAllAfterLimitDefault() {
        CartManager manager = new CartManager();
        FilmAtPlaybill first = new FilmAtPlaybill(1, 1, "first");
        FilmAtPlaybill second = new FilmAtPlaybill(2, 2, "second");
        FilmAtPlaybill third = new FilmAtPlaybill(3, 3, "third");
        FilmAtPlaybill fourth = new FilmAtPlaybill(3, 3, "fourth");
        FilmAtPlaybill fifth = new FilmAtPlaybill(3, 3, "fifth");
        FilmAtPlaybill sixth = new FilmAtPlaybill(3, 3, "sixth");
        FilmAtPlaybill seventh = new FilmAtPlaybill(3, 3, "seventh");
        FilmAtPlaybill eighth = new FilmAtPlaybill(3, 3, "eighth");
        FilmAtPlaybill ninth = new FilmAtPlaybill(3, 3, "ninth");
        FilmAtPlaybill tenth = new FilmAtPlaybill(3, 3, " tenth");
        FilmAtPlaybill eleventh = new FilmAtPlaybill(3, 3, "eleventh");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);


        manager.getAll();

        FilmAtPlaybill[] actual = manager.getAll();
        FilmAtPlaybill[] expected = new FilmAtPlaybill[]{eleventh,tenth,ninth,eighth,seventh,sixth,fifth,fourth,third,second};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldGetAllAfterLimitWithConstructor() {
        CartManager manager = new CartManager(2);
        FilmAtPlaybill first = new FilmAtPlaybill(1, 1, "first");
        FilmAtPlaybill second = new FilmAtPlaybill(2, 2, "second");
        FilmAtPlaybill third = new FilmAtPlaybill(3, 3, "third");

        manager.add(first);
        manager.add(second);
        manager.add(third);



        manager.getAll();

        FilmAtPlaybill[] actual = manager.getAll();
        FilmAtPlaybill[] expected = new FilmAtPlaybill[]{third,second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllBeforeLimitWithConstructor() {
        CartManager manager = new CartManager(4);
        FilmAtPlaybill first = new FilmAtPlaybill(1, 1, "first");
        FilmAtPlaybill second = new FilmAtPlaybill(2, 2, "second");
        FilmAtPlaybill third = new FilmAtPlaybill(3, 3, "third");

        manager.add(first);
        manager.add(second);
        manager.add(third);


        manager.getAll();

        FilmAtPlaybill[] actual = manager.getAll();
        FilmAtPlaybill[] expected = new FilmAtPlaybill[]{third,second,first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllIsLimitWithConstructor() {
        CartManager manager = new CartManager(3);
        FilmAtPlaybill first = new FilmAtPlaybill(1, 1, "first");
        FilmAtPlaybill second = new FilmAtPlaybill(2, 2, "second");
        FilmAtPlaybill third = new FilmAtPlaybill(3, 3, "third");

        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.getAll();

        FilmAtPlaybill[] actual = manager.getAll();
        FilmAtPlaybill[] expected = new FilmAtPlaybill[]{third,second,first};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldGetAllIsLimitDefault() {
        CartManager manager = new CartManager();
        FilmAtPlaybill first = new FilmAtPlaybill(1, 1, "first");
        FilmAtPlaybill second = new FilmAtPlaybill(2, 2, "second");
        FilmAtPlaybill third = new FilmAtPlaybill(3, 3, "third");
        FilmAtPlaybill fourth = new FilmAtPlaybill(3, 3, "fourth");
        FilmAtPlaybill fifth = new FilmAtPlaybill(3, 3, "fifth");
        FilmAtPlaybill sixth = new FilmAtPlaybill(3, 3, "sixth");
        FilmAtPlaybill seventh = new FilmAtPlaybill(3, 3, "seventh");
        FilmAtPlaybill eighth = new FilmAtPlaybill(3, 3, "eighth");
        FilmAtPlaybill ninth = new FilmAtPlaybill(3, 3, "ninth");
        FilmAtPlaybill tenth = new FilmAtPlaybill(3, 3, " tenth");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.getAll();

        FilmAtPlaybill[] actual = manager.getAll();
        FilmAtPlaybill[] expected = new FilmAtPlaybill[]{tenth,ninth,eighth,seventh,sixth,fifth,fourth,third,second,first};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldAdd() {
        CartManager manager = new CartManager();
        FilmAtPlaybill first = new FilmAtPlaybill(1, 1, "first");
        FilmAtPlaybill second = new FilmAtPlaybill(2, 2, "second");
        FilmAtPlaybill third = new FilmAtPlaybill(3, 3, "third");
        manager.add(first);
        manager.add(second);

        manager.add(third);

        FilmAtPlaybill[] actual = manager.getAll();
        FilmAtPlaybill[] expected = new FilmAtPlaybill[]{third,second,first};

        assertArrayEquals(expected, actual);

    }
}
