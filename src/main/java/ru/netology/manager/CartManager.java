package ru.netology.manager;
import ru.netology.domain.FilmAtPlaybill;

public class CartManager {
    private FilmAtPlaybill[] films = new FilmAtPlaybill[0];

    public void add(FilmAtPlaybill film) {
        // создаём новый массив размером на единицу больше
        int length = films.length + 1;
        FilmAtPlaybill[] tmp = new FilmAtPlaybill[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(films, 0, tmp, 0, films.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }



    public FilmAtPlaybill[] getAll() {
        FilmAtPlaybill[] result = new FilmAtPlaybill[films.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;


        //  2 конструктора: пустой и с resultLength. Внутри метода менеджера (как мне ответили на вопрос в чате)
//  Только почему resultLength красный??

//    public CartManager(int resultLength) {
//            this.resultLength = resultLength;
//
//        }
//
//    public CartManager() {
//        }



    }










}
