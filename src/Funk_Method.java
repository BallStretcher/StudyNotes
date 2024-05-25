import java.util.ArrayList;
import java.util.Collections;

public class Funk_Method {
    /*Функциональные интерфейсы - интерфейсы с одним методом, переменным которых можно присвоить
     выражение, заданное лямбда-функциями
     Существует интерфейс Consumer<Тип> с методом accept(Тип obj). Нужен он для передачи в forEach какого-нибудь действия

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Привет","как","Дела");
        list.forEach((s) -> System.out.println(s));
        Это вывод на экран всех элементов коллекции с помощью лямбда-выражения
        Скобки вокруг s можно опустить, если параметр один. Если параметров несколько - скобки нужны
        list.forEach(s -> System.out.println(s));
        А ещё есть подобные рофлы:
        list.forEach(System.out::println);
        объект::метод; аналогичен x->объект.метод(х); двойное двоеточие даёт понять компилятору, что метод
         надо передать, а не вызвать. Это самая простая и компактная запись

        :: полезны для потоков ввода-вывода. И ещё в трёх моментах:
         1)Ссылка на метод объекта.
         Показано выше. В кач-ве объекта могут фигурировать переменные this и super

         2)Ссылка на метод класса.
         Для передачи ссылки на статический метод нужно записать кода вида "класс::метод".

         3)Ссылка на конструктор.
        "класс::new"
        Например можно обойти стирание типов у коллекций и передать в метод toArray() ссылку на
        конструктор, который создаст нужный массив:
         toArray(int[]::new);
    */
}

