package lesson6;

import java.util.HashSet;
import java.util.Set;

/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
1. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
2. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
3. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
4. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
5. Переопределите метод хэшкод, пусть возвращает айди животного.
6. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
 */
public class Main {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat("Boris", "Veronika", 7, Color.BLACK));
        cats.add(new Cat("Barsik", "Maxim", 2, Color.WHITE));
        cats.add(new Cat("Musa", "Igor", 5, Color.GREY));
        cats.add(new Cat(100, "TestCat", "TestOwner", 12, Color.ORANGE));
        cats.add(new Cat(100, "TestCat", "TestOwner", 12, Color.ORANGE));
        cats.add(new Cat(100, "TestCat", "TestOwner", 12, Color.ORANGE));

        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
    }
}
