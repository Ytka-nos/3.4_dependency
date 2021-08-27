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

        ...
  int resultLength;
        if ??? {
            resultLength = ???
        } else {
            resultLength = ???
        }
  ??? result = new ???[resultLength];
        for (???) {
            // заполняем result из массива что лежит в поле
            // в обратном порядке
        }
...







        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;


        //  2 конструктора: пустой и с resultLength. Внутри метода менеджера (как мне ответили на вопрос в чате)
//  Только почему resultLength красный??

    public CartManager(int resultLength) {
            this.resultLength = resultLength;

        }

    public CartManager() {
        }



    }










    // наивная реализация
    public void removeById(int id) {
        int length = items.length - 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        int index = 0;
        for (PurchaseItem item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        // меняем наши элементы
        items = tmp;
    }
}
