package ru.netology.manager;

import ru.netology.domain.FilmAtPlaybill;

public class CartManager {
    private FilmAtPlaybill[] films = new FilmAtPlaybill[0];
    private int limit; // лимит по дефолту или тот лимит, который задал пользователь
    private int defaultLimit = 10;// лимит по дефолту

//      2 конструктора: пустой и с параметром для лимита

    public CartManager(int limit) {
        this.limit = limit; // this - текущий обьект, а просто limit - это параметр конструктора

    }

    public CartManager() {
        limit = defaultLimit; // если не задан лимит при создании обьекта, то лимит 10
    }

    public void add(FilmAtPlaybill film) {
        // создаём новый массив размером на единицу больше
        int length = films.length + 1;
        FilmAtPlaybill[] tmp = new FilmAtPlaybill[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }


    public FilmAtPlaybill[] getAll() {
        FilmAtPlaybill[] result = null;                 // result - это результат метода getAll (массив)
        int size = films.length;                   // переменная для размера массива с фильмами
        if (size < limit) {                       // а limit или по умолчанию или из конструктора
            result = new FilmAtPlaybill[size]; // тогда result будет того размера, которого у нас массив всех фильм
        } else {
            result = new FilmAtPlaybill[limit];  // тогда result будет размера limit
        }


        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {  // цикл до тех пор, пока i < того result.length, который мы вычислили
            int index = films.length - i - 1;
            result[i] = films[index];
        }


        return result;


    }


}
